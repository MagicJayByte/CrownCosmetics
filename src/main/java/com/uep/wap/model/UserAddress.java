package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
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

}
