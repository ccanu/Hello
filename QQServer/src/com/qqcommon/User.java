package com.qqcommon;

import java.io.Serializable;

public class User  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String passwd;

    public User(String number, String number1) {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
