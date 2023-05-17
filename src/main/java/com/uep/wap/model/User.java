package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "user")
public class User{

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserAddress userAddress;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserPayment> userPayments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<OrderDetails> ordersDetails;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ShoppingSession shoppingSession;

    public User() {
    }

}
