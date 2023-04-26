package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User{

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "password", length = 25)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "telephone", length = 15)
    private String telephone;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    public User() {
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Timestamp getCreated_at() {
        return createdAt;
    }

    public void setCreated_at(Timestamp created_at) {
        this.createdAt = created_at;
    }

    public Timestamp getModified_at() {
        return modifiedAt;
    }

    public void setModified_at(Timestamp modified_at) {
        this.modifiedAt = modified_at;
    }
}
