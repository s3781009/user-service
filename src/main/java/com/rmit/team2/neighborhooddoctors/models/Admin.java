package com.rmit.team2.neighborhooddoctors.models;

import javax.persistence.*;

@Entity
@Table(name = "admin")

public class Admin {
    @Id
    @SequenceGenerator(name = "admin_seq", sequenceName = "admin_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_seq")
    private long id;
    private String userName;
    private String email;
    private String password;

    public Admin(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Admin() {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

}


