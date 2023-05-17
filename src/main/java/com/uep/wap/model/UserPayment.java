package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_payment")
@Entity
@Getter
@Setter
public class UserPayment {

    @Id
    @Column(name = "user_payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_payment_id;

    @Column(name = "payment_type")
    private String payment_type;

    @Column(name = "provider")
    private String provider;

    @Column(name = "account_number")
    private String account_number;

    @Column(name = "IBAN_number")
    private String IBAN_number;

    @Column(name = "card_number")
    private String card_number;

    @Column(name = "expire_date")
    private Date expire_date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserPayment() {
    }

}

