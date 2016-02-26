package com.ai.shiro.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ai.util.RedisManager;
import com.ai.util.SerializeUtils;

public class RedisSessionDAO extends AbstractSessionDAO {

	private static Logger logger = LoggerFactory.getLogger(RedisSessionDAO.class);
	private static final int outTime = 30*60;//单位:second
	/**
	 * Shiro-Redis前缀
	 */
	private String keyPrefix = "shiro_redis_session:";

	@Override
	public void update(Session session) throws UnknownSessionException {
		this.saveSession(session);
	}

	private void saveSession(Session session) throws UnknownSessionException {
		if (session == null || session.getId() == null) {
			logger.error("session or session id is null");
			return;
		}
		String key = getSessionKey(session.getId());
		try {
			String value = SerializeUtils.serialize(session);
			session.setTimeout(outTime * 1000);
			RedisManager.set(key, value, outTime);
		} catch (Exception e) {
			logger.error("failed serialize session to redis:",e);
		}
	}

	@Override
	public void delete(Session session) {
		if (session == null || session.getId() == null) {
			logger.error("session or session id is null");
			return;
		}
		try {
			RedisManager.del(getSessionKey(session.getId()));
		} catch (Exception e) {
			logger.error("failed delete session:",e);
		}
	}

	// 用来统计当前活动的session
	@Override
	public Collection<Session> getActiveSessions() {
		Set<Session> sessions = new HashSet<Session>();
		try {
			Set<String> keys = RedisManager.keys(keyPrefix+"*");
			if (keys != null && keys.size() > 0) {
				for (String key : keys) {
					Session s = (Session) SerializeUtils.unSerialize(RedisManager.get(key));
					sessions.add(s);
				}
			}
		} catch (Exception e) {
			logger.error("cann't find any session",e);
		}
		return sessions;
	}

	@Override
	protected Serializable doCreate(Session session) {
		Serializable sessionId = this.generateSessionId(session);
		this.assignSessionId(session, sessionId);
		this.saveSession(session);
		return sessionId;
	}

	@Override
	protected Session doReadSession(Serializable sessionId) {
		if (sessionId == null) {
			logger.error("session id is null");
			return null;
		}
		Session s = null;
		try {
			s = (Session) SerializeUtils.unSerialize(RedisManager.get(getSessionKey(sessionId)));
		} catch (Exception e) {
			logger.error("cann't find session or failed unserialize session",e);
		}
		return s;
	}

	/**
	 * 获得key
	 * 
	 * @param key
	 * @return
	 */
	private String getSessionKey(Serializable sessionId) {
		String preKey = this.keyPrefix + sessionId;
		return preKey;
	}

	/**
	 * Returns the Redis session keys prefix.
	 * 
	 * @return The prefix
	 */
	public String getKeyPrefix() {
		return keyPrefix;
	}

	/**
	 * Sets the Redis sessions key prefix.
	 * 
	 * @param keyPrefix
	 *            The prefix
	 */
	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
	}
}
