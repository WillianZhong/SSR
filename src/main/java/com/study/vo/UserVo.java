package com.study.vo;

/**
 * @description:
 * @ClassName: $TYPE_NAME$
 * @Description: 描述
 * @author: gzlx
 * @date: 2018-11-07 14:28
 * @Version: 1.0
 */
public class UserVo {

    private String username;

    private String password;

    private boolean rememberme;

    private String vcode;

    public UserVo() {
        super();
    }

    public UserVo(String username, String password, boolean rememberme,String vcode) {
        this.username = username;
        this.password = password;
        this.rememberme = rememberme;
        this.vcode = vcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberme() {
        return rememberme;
    }

    public void setRememberme(boolean rememberme) {
        this.rememberme = rememberme;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }
}
