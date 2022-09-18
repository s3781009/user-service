package com.rmit.team2.neighborhooddoctors.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    enum userType {
        User,
        GP,
        Admin;
    }
    private int role;// the number tells what type of user it is 0 is a user 1 a gp and 2 an admin

    public User(String firstName, String lastName, String email, String password, int rNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = rNum;
    }

    public User() {

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(int role) {
        this.role = role;
    }
    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public userType getRole(){
        userType arr[] = userType.values();
        return arr[this.role];
    }
}
