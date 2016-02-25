package com.ai.secruity.model;

public class OrgInfo {
    private Long orgId;

    private String orgIcon;

    private String orgName;

    private String orgRmk;

    private String orgPid;

    private String orgSeq;

    private String rmk1;

    private String rmk2;

    private String rmk3;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgIcon() {
        return orgIcon;
    }

    public void setOrgIcon(String orgIcon) {
        this.orgIcon = orgIcon == null ? null : orgIcon.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgRmk() {
        return orgRmk;
    }

    public void setOrgRmk(String orgRmk) {
        this.orgRmk = orgRmk == null ? null : orgRmk.trim();
    }

    public String getOrgPid() {
        return orgPid;
    }

    public void setOrgPid(String orgPid) {
        this.orgPid = orgPid == null ? null : orgPid.trim();
    }

    public String getOrgSeq() {
        return orgSeq;
    }

    public void setOrgSeq(String orgSeq) {
        this.orgSeq = orgSeq == null ? null : orgSeq.trim();
    }

    public String getRmk1() {
        return rmk1;
    }

    public void setRmk1(String rmk1) {
        this.rmk1 = rmk1 == null ? null : rmk1.trim();
    }

    public String getRmk2() {
        return rmk2;
    }

    public void setRmk2(String rmk2) {
        this.rmk2 = rmk2 == null ? null : rmk2.trim();
    }

    public String getRmk3() {
        return rmk3;
    }

    public void setRmk3(String rmk3) {
        this.rmk3 = rmk3 == null ? null : rmk3.trim();
    }
}