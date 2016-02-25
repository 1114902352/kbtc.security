package com.ai.secruity.model;

public class UserInfo {
    private Long userId;

    private String userName;

    private String userCreatedatetime;

    private String userModifydatetime;

    private String userPassword;

    private String userPhone;

    private String userDesc;

    private String userPic;

    private String userVip;

    private String userState;

    private String userDynamicPw;

    private String rmk1;

    private String rmk2;

    private String rmk3;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCreatedatetime() {
        return userCreatedatetime;
    }

    public void setUserCreatedatetime(String userCreatedatetime) {
        this.userCreatedatetime = userCreatedatetime == null ? null : userCreatedatetime.trim();
    }

    public String getUserModifydatetime() {
        return userModifydatetime;
    }

    public void setUserModifydatetime(String userModifydatetime) {
        this.userModifydatetime = userModifydatetime == null ? null : userModifydatetime.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    public String getUserVip() {
        return userVip;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip == null ? null : userVip.trim();
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }

    public String getUserDynamicPw() {
        return userDynamicPw;
    }

    public void setUserDynamicPw(String userDynamicPw) {
        this.userDynamicPw = userDynamicPw == null ? null : userDynamicPw.trim();
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