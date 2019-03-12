package com.jie.myspringboot.pojo;

public class EUser {
    public void setId(int id) {
        this.id = id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setE_account(String e_account) {
        this.e_account = e_account;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }

    public void setE_photo(String e_photo) {
        this.e_photo = e_photo;
    }

    public void setE_intro(String e_intro) {
        this.e_intro = e_intro;
    }

    public int getId() {
        return id;
    }

    public String getE_name() {
        return e_name;
    }

    public String getE_account() {
        return e_account;
    }

    public String getE_password() {
        return e_password;
    }

    public String getE_photo() {
        return e_photo;
    }

    public String getE_intro() {
        return e_intro;
    }

    private  int id;
    private String e_name;
    private String e_account;
    private String e_password;
    private String e_photo;
    private String e_intro;
}
