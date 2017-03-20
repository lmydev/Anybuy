package com.lmy.anybuy.logic.bean;

import cn.bmob.v3.BmobObject;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/2/14
 */

public class UserInfo extends BmobObject{
    private String phone;
    private String password;
    private String email;

    public String getUserName() {
        return phone;
    }

    public void setUserName(String userName) {
        this.phone = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
