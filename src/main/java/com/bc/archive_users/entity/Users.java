package com.bc.archive_users.entity;

import com.bc.archive_users.arraymapping.CustomIntegerArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.Date;

@TypeDefs({
        @TypeDef(
                name = "CustomIntegerArray",
                typeClass = CustomIntegerArrayType.class
        )
})
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private Date bday;
    @Column
    private String email;
    @Column(columnDefinition = "int[]")
    @Type(type = "CustomIntegerArray")
    private Integer[] friends_id;
    @Column(columnDefinition = "int[]")
    @Type(type = "CustomIntegerArray")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
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