package com.ai.secruity.model;

public class ResInfo {
    private Long resId;

    private String resIcon;

    private String resName;

    private String resRmk;

    private String resUrl;

    private String resPid;

    private String resSeq;

    private String resType;

    private String resPerm;

    private String rmk1;

    private String rmk2;

    private String rmk3;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResIcon() {
        return resIcon;
    }

    public void setResIcon(String resIcon) {
        this.resIcon = resIcon == null ? null : resIcon.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResRmk() {
        return resRmk;
    }

    public void setResRmk(String resRmk) {
        this.resRmk = resRmk == null ? null : resRmk.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public String getResPid() {
        return resPid;
    }

    public void setResPid(String resPid) {
        this.resPid = resPid == null ? null : resPid.trim();
    }

    public String getResSeq() {
        return resSeq;
    }

    public void setResSeq(String resSeq) {
        this.resSeq = resSeq == null ? null : resSeq.trim();
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    public String getResPerm() {
        return resPerm;
    }

    public void setResPerm(String resPerm) {
        this.resPerm = resPerm == null ? null : resPerm.trim();
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