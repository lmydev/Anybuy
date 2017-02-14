package com.lmy.anybuy.logic.bean;

import cn.bmob.v3.BmobObject;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/2/14
 */

public class UserInfo extends BmobObject{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
