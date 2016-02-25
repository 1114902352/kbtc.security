package com.ai.secruity.model;

public class RoleInfo {
    private Long roleId;

    private String rolePid;

    private String roleName;

    private String roleRmk;

    private String roleSeq;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRolePid() {
        return rolePid;
    }

    public void setRolePid(String rolePid) {
        this.rolePid = rolePid == null ? null : rolePid.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleRmk() {
        return roleRmk;
    }

    public void setRoleRmk(String roleRmk) {
        this.roleRmk = roleRmk == null ? null : roleRmk.trim();
    }

    public String getRoleSeq() {
        return roleSeq;
    }

    public void setRoleSeq(String roleSeq) {
        this.roleSeq = roleSeq == null ? null : roleSeq.trim();
    }
}