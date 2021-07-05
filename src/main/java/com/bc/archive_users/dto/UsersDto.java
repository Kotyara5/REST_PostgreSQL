package com.bc.archive_users.dto;

import java.util.Date;

public class UsersDto {

    private Integer id;
    private String login;
    private String name;
    private Date bday;
    private String email;
    private Integer[] friends_id;
    private Integer[] dialogs_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer[] getFriends_id() {
        return friends_id;
    }

    public void setFriends_id(Integer[] friends_id) {
        this.friends_id = friends_id;
    }

    public Integer[] getDialogs_id() {
        return dialogs_id;
    }

    public void setDialogs_id(Integer[] dialogs_id) {
        this.dialogs_id = dialogs_id;
    }
}
