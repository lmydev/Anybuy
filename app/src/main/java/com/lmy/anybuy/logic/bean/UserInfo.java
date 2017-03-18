package com.lmy.anybuy.logic.bean;

import cn.bmob.v3.BmobObject;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/2/14
 */

public class UserInfo extends BmobObject{
    private String userName;
    private String passWord;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
