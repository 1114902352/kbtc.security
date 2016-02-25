package com.ai.secruity.model;

import java.util.ArrayList;
import java.util.List;

public class RoleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleInfoExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRolePidIsNull() {
            addCriterion("ROLE_PID is null");
            return (Criteria) this;
        }

        public Criteria andRolePidIsNotNull() {
            addCriterion("ROLE_PID is not null");
            return (Criteria) this;
        }

        public Criteria andRolePidEqualTo(String value) {
            addCriterion("ROLE_PID =", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotEqualTo(String value) {
            addCriterion("ROLE_PID <>", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidGreaterThan(String value) {
            addCriterion("ROLE_PID >", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_PID >=", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidLessThan(String value) {
            addCriterion("ROLE_PID <", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidLessThanOrEqualTo(String value) {
            addCriterion("ROLE_PID <=", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidLike(String value) {
            addCriterion("ROLE_PID like", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotLike(String value) {
            addCriterion("ROLE_PID not like", value, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidIn(List<String> values) {
            addCriterion("ROLE_PID in", values, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotIn(List<String> values) {
            addCriterion("ROLE_PID not in", values, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidBetween(String value1, String value2) {
            addCriterion("ROLE_PID between", value1, value2, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRolePidNotBetween(String value1, String value2) {
            addCriterion("ROLE_PID not between", value1, value2, "rolePid");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleRmkIsNull() {
            addCriterion("ROLE_RMK is null");
            return (Criteria) this;
        }

        public Criteria andRoleRmkIsNotNull() {
            addCriterion("ROLE_RMK is not null");
            return (Criteria) this;
        }

        public Criteria andRoleRmkEqualTo(String value) {
            addCriterion("ROLE_RMK =", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkNotEqualTo(String value) {
            addCriterion("ROLE_RMK <>", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkGreaterThan(String value) {
            addCriterion("ROLE_RMK >", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_RMK >=", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkLessThan(String value) {
            addCriterion("ROLE_RMK <", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkLessThanOrEqualTo(String value) {
            addCriterion("ROLE_RMK <=", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkLike(String value) {
            addCriterion("ROLE_RMK like", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkNotLike(String value) {
            addCriterion("ROLE_RMK not like", value, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkIn(List<String> values) {
            addCriterion("ROLE_RMK in", values, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkNotIn(List<String> values) {
            addCriterion("ROLE_RMK not in", values, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkBetween(String value1, String value2) {
            addCriterion("ROLE_RMK between", value1, value2, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleRmkNotBetween(String value1, String value2) {
            addCriterion("ROLE_RMK not between", value1, value2, "roleRmk");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIsNull() {
            addCriterion("ROLE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIsNotNull() {
            addCriterion("ROLE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSeqEqualTo(String value) {
            addCriterion("ROLE_SEQ =", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotEqualTo(String value) {
            addCriterion("ROLE_SEQ <>", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqGreaterThan(String value) {
            addCriterion("ROLE_SEQ >", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_SEQ >=", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLessThan(String value) {
            addCriterion("ROLE_SEQ <", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLessThanOrEqualTo(String value) {
            addCriterion("ROLE_SEQ <=", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLike(String value) {
            addCriterion("ROLE_SEQ like", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotLike(String value) {
            addCriterion("ROLE_SEQ not like", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIn(List<String> values) {
            addCriterion("ROLE_SEQ in", values, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotIn(List<String> values) {
            addCriterion("ROLE_SEQ not in", values, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqBetween(String value1, String value2) {
            addCriterion("ROLE_SEQ between", value1, value2, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotBetween(String value1, String value2) {
            addCriterion("ROLE_SEQ not between", value1, value2, "roleSeq");
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