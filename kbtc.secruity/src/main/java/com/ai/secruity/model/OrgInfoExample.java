package com.ai.secruity.model;

import java.util.ArrayList;
import java.util.List;

public class OrgInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgInfoExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIconIsNull() {
            addCriterion("ORG_ICON is null");
            return (Criteria) this;
        }

        public Criteria andOrgIconIsNotNull() {
            addCriterion("ORG_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIconEqualTo(String value) {
            addCriterion("ORG_ICON =", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconNotEqualTo(String value) {
            addCriterion("ORG_ICON <>", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconGreaterThan(String value) {
            addCriterion("ORG_ICON >", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ICON >=", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconLessThan(String value) {
            addCriterion("ORG_ICON <", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconLessThanOrEqualTo(String value) {
            addCriterion("ORG_ICON <=", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconLike(String value) {
            addCriterion("ORG_ICON like", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconNotLike(String value) {
            addCriterion("ORG_ICON not like", value, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconIn(List<String> values) {
            addCriterion("ORG_ICON in", values, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconNotIn(List<String> values) {
            addCriterion("ORG_ICON not in", values, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconBetween(String value1, String value2) {
            addCriterion("ORG_ICON between", value1, value2, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgIconNotBetween(String value1, String value2) {
            addCriterion("ORG_ICON not between", value1, value2, "orgIcon");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgRmkIsNull() {
            addCriterion("ORG_RMK is null");
            return (Criteria) this;
        }

        public Criteria andOrgRmkIsNotNull() {
            addCriterion("ORG_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andOrgRmkEqualTo(String value) {
            addCriterion("ORG_RMK =", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkNotEqualTo(String value) {
            addCriterion("ORG_RMK <>", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkGreaterThan(String value) {
            addCriterion("ORG_RMK >", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_RMK >=", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkLessThan(String value) {
            addCriterion("ORG_RMK <", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkLessThanOrEqualTo(String value) {
            addCriterion("ORG_RMK <=", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkLike(String value) {
            addCriterion("ORG_RMK like", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkNotLike(String value) {
            addCriterion("ORG_RMK not like", value, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkIn(List<String> values) {
            addCriterion("ORG_RMK in", values, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkNotIn(List<String> values) {
            addCriterion("ORG_RMK not in", values, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkBetween(String value1, String value2) {
            addCriterion("ORG_RMK between", value1, value2, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgRmkNotBetween(String value1, String value2) {
            addCriterion("ORG_RMK not between", value1, value2, "orgRmk");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNull() {
            addCriterion("ORG_PID is null");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNotNull() {
            addCriterion("ORG_PID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPidEqualTo(String value) {
            addCriterion("ORG_PID =", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotEqualTo(String value) {
            addCriterion("ORG_PID <>", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThan(String value) {
            addCriterion("ORG_PID >", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_PID >=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThan(String value) {
            addCriterion("ORG_PID <", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThanOrEqualTo(String value) {
            addCriterion("ORG_PID <=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLike(String value) {
            addCriterion("ORG_PID like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotLike(String value) {
            addCriterion("ORG_PID not like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidIn(List<String> values) {
            addCriterion("ORG_PID in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotIn(List<String> values) {
            addCriterion("ORG_PID not in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidBetween(String value1, String value2) {
            addCriterion("ORG_PID between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotBetween(String value1, String value2) {
            addCriterion("ORG_PID not between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgSeqIsNull() {
            addCriterion("ORG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOrgSeqIsNotNull() {
            addCriterion("ORG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSeqEqualTo(String value) {
            addCriterion("ORG_SEQ =", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqNotEqualTo(String value) {
            addCriterion("ORG_SEQ <>", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqGreaterThan(String value) {
            addCriterion("ORG_SEQ >", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SEQ >=", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqLessThan(String value) {
            addCriterion("ORG_SEQ <", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqLessThanOrEqualTo(String value) {
            addCriterion("ORG_SEQ <=", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqLike(String value) {
            addCriterion("ORG_SEQ like", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqNotLike(String value) {
            addCriterion("ORG_SEQ not like", value, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqIn(List<String> values) {
            addCriterion("ORG_SEQ in", values, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqNotIn(List<String> values) {
            addCriterion("ORG_SEQ not in", values, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqBetween(String value1, String value2) {
            addCriterion("ORG_SEQ between", value1, value2, "orgSeq");
            return (Criteria) this;
        }

        public Criteria andOrgSeqNotBetween(String value1, String value2) {
            addCriterion("ORG_SEQ not between", value1, value2, "orgSeq");
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