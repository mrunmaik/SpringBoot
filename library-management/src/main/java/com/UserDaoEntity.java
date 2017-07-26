package com;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@Access(AccessType.FIELD)
public class UserDaoEntity {
    @Id
    @Column(name = "userId")
    private int    id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    public UserDaoEntity() {

    }

    public UserDaoEntity(int id, String username, String password) {
        this.id = id;
        this.userName = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
