package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name = "user_address")
public class UserAddress {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "street", length = 60)
    private String street;

    @Column(name = "city", length = 60)
    private String city;

    @Column(name = "state", length = 30)
    private String state;

    @Column(name = "zip", length = 10)
    private String zip;

    @Column(name = "country", length = 60)
    private String country;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "mobile", length = 15)
    private String mobile;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setId(long id){
        this.id = id;
    }

    public UserAddress() {
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String address) {
        this.street = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
