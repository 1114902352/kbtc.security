package com.ai.secruity.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeIsNull() {
            addCriterion("USER_CREATEDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeIsNotNull() {
            addCriterion("USER_CREATEDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeEqualTo(String value) {
            addCriterion("USER_CREATEDATETIME =", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeNotEqualTo(String value) {
            addCriterion("USER_CREATEDATETIME <>", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeGreaterThan(String value) {
            addCriterion("USER_CREATEDATETIME >", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CREATEDATETIME >=", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeLessThan(String value) {
            addCriterion("USER_CREATEDATETIME <", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeLessThanOrEqualTo(String value) {
            addCriterion("USER_CREATEDATETIME <=", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeLike(String value) {
            addCriterion("USER_CREATEDATETIME like", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeNotLike(String value) {
            addCriterion("USER_CREATEDATETIME not like", value, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeIn(List<String> values) {
            addCriterion("USER_CREATEDATETIME in", values, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeNotIn(List<String> values) {
            addCriterion("USER_CREATEDATETIME not in", values, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeBetween(String value1, String value2) {
            addCriterion("USER_CREATEDATETIME between", value1, value2, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatetimeNotBetween(String value1, String value2) {
            addCriterion("USER_CREATEDATETIME not between", value1, value2, "userCreatedatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeIsNull() {
            addCriterion("USER_MODIFYDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeIsNotNull() {
            addCriterion("USER_MODIFYDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeEqualTo(String value) {
            addCriterion("USER_MODIFYDATETIME =", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeNotEqualTo(String value) {
            addCriterion("USER_MODIFYDATETIME <>", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeGreaterThan(String value) {
            addCriterion("USER_MODIFYDATETIME >", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MODIFYDATETIME >=", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeLessThan(String value) {
            addCriterion("USER_MODIFYDATETIME <", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeLessThanOrEqualTo(String value) {
            addCriterion("USER_MODIFYDATETIME <=", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeLike(String value) {
            addCriterion("USER_MODIFYDATETIME like", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeNotLike(String value) {
            addCriterion("USER_MODIFYDATETIME not like", value, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeIn(List<String> values) {
            addCriterion("USER_MODIFYDATETIME in", values, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeNotIn(List<String> values) {
            addCriterion("USER_MODIFYDATETIME not in", values, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeBetween(String value1, String value2) {
            addCriterion("USER_MODIFYDATETIME between", value1, value2, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifydatetimeNotBetween(String value1, String value2) {
            addCriterion("USER_MODIFYDATETIME not between", value1, value2, "userModifydatetime");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("USER_PHONE =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("USER_PHONE <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("USER_PHONE >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("USER_PHONE <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("USER_PHONE like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("USER_PHONE not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("USER_PHONE in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("USER_PHONE not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("USER_PHONE between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNull() {
            addCriterion("USER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNotNull() {
            addCriterion("USER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescEqualTo(String value) {
            addCriterion("USER_DESC =", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotEqualTo(String value) {
            addCriterion("USER_DESC <>", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThan(String value) {
            addCriterion("USER_DESC >", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DESC >=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThan(String value) {
            addCriterion("USER_DESC <", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThanOrEqualTo(String value) {
            addCriterion("USER_DESC <=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLike(String value) {
            addCriterion("USER_DESC like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotLike(String value) {
            addCriterion("USER_DESC not like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescIn(List<String> values) {
            addCriterion("USER_DESC in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotIn(List<String> values) {
            addCriterion("USER_DESC not in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescBetween(String value1, String value2) {
            addCriterion("USER_DESC between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotBetween(String value1, String value2) {
            addCriterion("USER_DESC not between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserPicIsNull() {
            addCriterion("USER_PIC is null");
            return (Criteria) this;
        }

        public Criteria andUserPicIsNotNull() {
            addCriterion("USER_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andUserPicEqualTo(String value) {
            addCriterion("USER_PIC =", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotEqualTo(String value) {
            addCriterion("USER_PIC <>", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThan(String value) {
            addCriterion("USER_PIC >", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PIC >=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThan(String value) {
            addCriterion("USER_PIC <", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThanOrEqualTo(String value) {
            addCriterion("USER_PIC <=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLike(String value) {
            addCriterion("USER_PIC like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotLike(String value) {
            addCriterion("USER_PIC not like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicIn(List<String> values) {
            addCriterion("USER_PIC in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotIn(List<String> values) {
            addCriterion("USER_PIC not in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicBetween(String value1, String value2) {
            addCriterion("USER_PIC between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotBetween(String value1, String value2) {
            addCriterion("USER_PIC not between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserVipIsNull() {
            addCriterion("USER_VIP is null");
            return (Criteria) this;
        }

        public Criteria andUserVipIsNotNull() {
            addCriterion("USER_VIP is not null");
            return (Criteria) this;
        }

        public Criteria andUserVipEqualTo(String value) {
            addCriterion("USER_VIP =", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotEqualTo(String value) {
            addCriterion("USER_VIP <>", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipGreaterThan(String value) {
            addCriterion("USER_VIP >", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipGreaterThanOrEqualTo(String value) {
            addCriterion("USER_VIP >=", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLessThan(String value) {
            addCriterion("USER_VIP <", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLessThanOrEqualTo(String value) {
            addCriterion("USER_VIP <=", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLike(String value) {
            addCriterion("USER_VIP like", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotLike(String value) {
            addCriterion("USER_VIP not like", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipIn(List<String> values) {
            addCriterion("USER_VIP in", values, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotIn(List<String> values) {
            addCriterion("USER_VIP not in", values, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipBetween(String value1, String value2) {
            addCriterion("USER_VIP between", value1, value2, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotBetween(String value1, String value2) {
            addCriterion("USER_VIP not between", value1, value2, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("USER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("USER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("USER_STATE =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("USER_STATE <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("USER_STATE >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATE >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("USER_STATE <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("USER_STATE <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("USER_STATE like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("USER_STATE not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("USER_STATE in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("USER_STATE not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("USER_STATE between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("USER_STATE not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwIsNull() {
            addCriterion("USER_DYNAMIC_PW is null");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwIsNotNull() {
            addCriterion("USER_DYNAMIC_PW is not null");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwEqualTo(String value) {
            addCriterion("USER_DYNAMIC_PW =", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwNotEqualTo(String value) {
            addCriterion("USER_DYNAMIC_PW <>", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwGreaterThan(String value) {
            addCriterion("USER_DYNAMIC_PW >", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DYNAMIC_PW >=", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwLessThan(String value) {
            addCriterion("USER_DYNAMIC_PW <", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwLessThanOrEqualTo(String value) {
            addCriterion("USER_DYNAMIC_PW <=", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwLike(String value) {
            addCriterion("USER_DYNAMIC_PW like", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwNotLike(String value) {
            addCriterion("USER_DYNAMIC_PW not like", value, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwIn(List<String> values) {
            addCriterion("USER_DYNAMIC_PW in", values, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwNotIn(List<String> values) {
            addCriterion("USER_DYNAMIC_PW not in", values, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwBetween(String value1, String value2) {
            addCriterion("USER_DYNAMIC_PW between", value1, value2, "userDynamicPw");
            return (Criteria) this;
        }

        public Criteria andUserDynamicPwNotBetween(String value1, String value2) {
            addCriterion("USER_DYNAMIC_PW not between", value1, value2, "userDynamicPw");
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