package com.ai.secruity.model;

import java.util.ArrayList;
import java.util.List;

public class ResInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Long value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Long value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Long value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Long value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Long value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Long> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Long> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Long value1, Long value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Long value1, Long value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIconIsNull() {
            addCriterion("RES_ICON is null");
            return (Criteria) this;
        }

        public Criteria andResIconIsNotNull() {
            addCriterion("RES_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andResIconEqualTo(String value) {
            addCriterion("RES_ICON =", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotEqualTo(String value) {
            addCriterion("RES_ICON <>", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThan(String value) {
            addCriterion("RES_ICON >", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThanOrEqualTo(String value) {
            addCriterion("RES_ICON >=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThan(String value) {
            addCriterion("RES_ICON <", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThanOrEqualTo(String value) {
            addCriterion("RES_ICON <=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLike(String value) {
            addCriterion("RES_ICON like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotLike(String value) {
            addCriterion("RES_ICON not like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconIn(List<String> values) {
            addCriterion("RES_ICON in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotIn(List<String> values) {
            addCriterion("RES_ICON not in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconBetween(String value1, String value2) {
            addCriterion("RES_ICON between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotBetween(String value1, String value2) {
            addCriterion("RES_ICON not between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("RES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("RES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("RES_NAME =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("RES_NAME <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("RES_NAME >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("RES_NAME >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("RES_NAME <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("RES_NAME <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("RES_NAME like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("RES_NAME not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("RES_NAME in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("RES_NAME not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("RES_NAME between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("RES_NAME not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResRmkIsNull() {
            addCriterion("RES_RMK is null");
            return (Criteria) this;
        }

        public Criteria andResRmkIsNotNull() {
            addCriterion("RES_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andResRmkEqualTo(String value) {
            addCriterion("RES_RMK =", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkNotEqualTo(String value) {
            addCriterion("RES_RMK <>", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkGreaterThan(String value) {
            addCriterion("RES_RMK >", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkGreaterThanOrEqualTo(String value) {
            addCriterion("RES_RMK >=", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkLessThan(String value) {
            addCriterion("RES_RMK <", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkLessThanOrEqualTo(String value) {
            addCriterion("RES_RMK <=", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkLike(String value) {
            addCriterion("RES_RMK like", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkNotLike(String value) {
            addCriterion("RES_RMK not like", value, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkIn(List<String> values) {
            addCriterion("RES_RMK in", values, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkNotIn(List<String> values) {
            addCriterion("RES_RMK not in", values, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkBetween(String value1, String value2) {
            addCriterion("RES_RMK between", value1, value2, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResRmkNotBetween(String value1, String value2) {
            addCriterion("RES_RMK not between", value1, value2, "resRmk");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNull() {
            addCriterion("RES_URL is null");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNotNull() {
            addCriterion("RES_URL is not null");
            return (Criteria) this;
        }

        public Criteria andResUrlEqualTo(String value) {
            addCriterion("RES_URL =", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotEqualTo(String value) {
            addCriterion("RES_URL <>", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThan(String value) {
            addCriterion("RES_URL >", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RES_URL >=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThan(String value) {
            addCriterion("RES_URL <", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThanOrEqualTo(String value) {
            addCriterion("RES_URL <=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLike(String value) {
            addCriterion("RES_URL like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotLike(String value) {
            addCriterion("RES_URL not like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlIn(List<String> values) {
            addCriterion("RES_URL in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotIn(List<String> values) {
            addCriterion("RES_URL not in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlBetween(String value1, String value2) {
            addCriterion("RES_URL between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotBetween(String value1, String value2) {
            addCriterion("RES_URL not between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResPidIsNull() {
            addCriterion("RES_PID is null");
            return (Criteria) this;
        }

        public Criteria andResPidIsNotNull() {
            addCriterion("RES_PID is not null");
            return (Criteria) this;
        }

        public Criteria andResPidEqualTo(String value) {
            addCriterion("RES_PID =", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotEqualTo(String value) {
            addCriterion("RES_PID <>", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidGreaterThan(String value) {
            addCriterion("RES_PID >", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidGreaterThanOrEqualTo(String value) {
            addCriterion("RES_PID >=", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLessThan(String value) {
            addCriterion("RES_PID <", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLessThanOrEqualTo(String value) {
            addCriterion("RES_PID <=", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidLike(String value) {
            addCriterion("RES_PID like", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotLike(String value) {
            addCriterion("RES_PID not like", value, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidIn(List<String> values) {
            addCriterion("RES_PID in", values, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotIn(List<String> values) {
            addCriterion("RES_PID not in", values, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidBetween(String value1, String value2) {
            addCriterion("RES_PID between", value1, value2, "resPid");
            return (Criteria) this;
        }

        public Criteria andResPidNotBetween(String value1, String value2) {
            addCriterion("RES_PID not between", value1, value2, "resPid");
            return (Criteria) this;
        }

        public Criteria andResSeqIsNull() {
            addCriterion("RES_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andResSeqIsNotNull() {
            addCriterion("RES_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andResSeqEqualTo(String value) {
            addCriterion("RES_SEQ =", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotEqualTo(String value) {
            addCriterion("RES_SEQ <>", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqGreaterThan(String value) {
            addCriterion("RES_SEQ >", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RES_SEQ >=", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqLessThan(String value) {
            addCriterion("RES_SEQ <", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqLessThanOrEqualTo(String value) {
            addCriterion("RES_SEQ <=", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqLike(String value) {
            addCriterion("RES_SEQ like", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotLike(String value) {
            addCriterion("RES_SEQ not like", value, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqIn(List<String> values) {
            addCriterion("RES_SEQ in", values, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotIn(List<String> values) {
            addCriterion("RES_SEQ not in", values, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqBetween(String value1, String value2) {
            addCriterion("RES_SEQ between", value1, value2, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResSeqNotBetween(String value1, String value2) {
            addCriterion("RES_SEQ not between", value1, value2, "resSeq");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("RES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("RES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("RES_TYPE =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("RES_TYPE <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("RES_TYPE >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_TYPE >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("RES_TYPE <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("RES_TYPE <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("RES_TYPE like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("RES_TYPE not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("RES_TYPE in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("RES_TYPE not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("RES_TYPE between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("RES_TYPE not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResPermIsNull() {
            addCriterion("RES_PERM is null");
            return (Criteria) this;
        }

        public Criteria andResPermIsNotNull() {
            addCriterion("RES_PERM is not null");
            return (Criteria) this;
        }

        public Criteria andResPermEqualTo(String value) {
            addCriterion("RES_PERM =", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermNotEqualTo(String value) {
            addCriterion("RES_PERM <>", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermGreaterThan(String value) {
            addCriterion("RES_PERM >", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermGreaterThanOrEqualTo(String value) {
            addCriterion("RES_PERM >=", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermLessThan(String value) {
            addCriterion("RES_PERM <", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermLessThanOrEqualTo(String value) {
            addCriterion("RES_PERM <=", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermLike(String value) {
            addCriterion("RES_PERM like", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermNotLike(String value) {
            addCriterion("RES_PERM not like", value, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermIn(List<String> values) {
            addCriterion("RES_PERM in", values, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermNotIn(List<String> values) {
            addCriterion("RES_PERM not in", values, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermBetween(String value1, String value2) {
            addCriterion("RES_PERM between", value1, value2, "resPerm");
            return (Criteria) this;
        }

        public Criteria andResPermNotBetween(String value1, String value2) {
            addCriterion("RES_PERM not between", value1, value2, "resPerm");
            return (Criteria) this;
        }

        public Criteria andRmk1IsNull() {
            addCriterion("RMK1 is null");
            return (Criteria) this;
        }

        public Criteria andRmk1IsNotNull() {
            addCriterion("RMK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRmk1EqualTo(String value) {
            addCriterion("RMK1 =", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1NotEqualTo(String value) {
            addCriterion("RMK1 <>", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1GreaterThan(String value) {
            addCriterion("RMK1 >", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1GreaterThanOrEqualTo(String value) {
            addCriterion("RMK1 >=", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1LessThan(String value) {
            addCriterion("RMK1 <", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1LessThanOrEqualTo(String value) {
            addCriterion("RMK1 <=", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1Like(String value) {
            addCriterion("RMK1 like", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1NotLike(String value) {
            addCriterion("RMK1 not like", value, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1In(List<String> values) {
            addCriterion("RMK1 in", values, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1NotIn(List<String> values) {
            addCriterion("RMK1 not in", values, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1Between(String value1, String value2) {
            addCriterion("RMK1 between", value1, value2, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk1NotBetween(String value1, String value2) {
            addCriterion("RMK1 not between", value1, value2, "rmk1");
            return (Criteria) this;
        }

        public Criteria andRmk2IsNull() {
            addCriterion("RMK2 is null");
            return (Criteria) this;
        }

        public Criteria andRmk2IsNotNull() {
            addCriterion("RMK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRmk2EqualTo(String value) {
            addCriterion("RMK2 =", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2NotEqualTo(String value) {
            addCriterion("RMK2 <>", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2GreaterThan(String value) {
            addCriterion("RMK2 >", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2GreaterThanOrEqualTo(String value) {
            addCriterion("RMK2 >=", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2LessThan(String value) {
            addCriterion("RMK2 <", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2LessThanOrEqualTo(String value) {
            addCriterion("RMK2 <=", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2Like(String value) {
            addCriterion("RMK2 like", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2NotLike(String value) {
            addCriterion("RMK2 not like", value, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2In(List<String> values) {
            addCriterion("RMK2 in", values, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2NotIn(List<String> values) {
            addCriterion("RMK2 not in", values, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2Between(String value1, String value2) {
            addCriterion("RMK2 between", value1, value2, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk2NotBetween(String value1, String value2) {
            addCriterion("RMK2 not between", value1, value2, "rmk2");
            return (Criteria) this;
        }

        public Criteria andRmk3IsNull() {
            addCriterion("RMK3 is null");
            return (Criteria) this;
        }

        public Criteria andRmk3IsNotNull() {
            addCriterion("RMK3 is not null");
            return (Criteria) this;
        }

        public Criteria andRmk3EqualTo(String value) {
            addCriterion("RMK3 =", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3NotEqualTo(String value) {
            addCriterion("RMK3 <>", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3GreaterThan(String value) {
            addCriterion("RMK3 >", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3GreaterThanOrEqualTo(String value) {
            addCriterion("RMK3 >=", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3LessThan(String value) {
            addCriterion("RMK3 <", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3LessThanOrEqualTo(String value) {
            addCriterion("RMK3 <=", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3Like(String value) {
            addCriterion("RMK3 like", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3NotLike(String value) {
            addCriterion("RMK3 not like", value, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3In(List<String> values) {
            addCriterion("RMK3 in", values, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3NotIn(List<String> values) {
            addCriterion("RMK3 not in", values, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3Between(String value1, String value2) {
            addCriterion("RMK3 between", value1, value2, "rmk3");
            return (Criteria) this;
        }

        public Criteria andRmk3NotBetween(String value1, String value2) {
            addCriterion("RMK3 not between", value1, value2, "rmk3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}