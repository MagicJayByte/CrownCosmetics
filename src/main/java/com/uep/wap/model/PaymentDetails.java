package com.uep.wap.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "payment_details")
@Getter
@Setter
public class PaymentDetails {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "provider", length = 25)
    private String provider;

    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @OneToOne
    @JoinColumn(name = "order_details_id")
    private OrderDetails orderDetails;

    public PaymentDetails() {
    }

}
