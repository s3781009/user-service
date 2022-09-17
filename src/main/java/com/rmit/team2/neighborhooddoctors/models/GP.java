package com.rmit.team2.neighborhooddoctors.models;

import javax.persistence.*;

@Entity
@Table(name = "gp")

public class GP {
    @Id
    @SequenceGenerator(name = "gp_seq", sequenceName = "gp_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gp_seq")
    private long id;
    private String name;
    private String location;
    private String email;
    private String password;

    public GP(String Name, String location, String email, String password) {
        this.name = Name;
        this.location = location;
        this.email = email;
        this.password = password;
    }

    public GP() {

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

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}