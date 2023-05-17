package com.uep.wap.model;

import javax.persistence.*;

import lombok.Setter;
import lombok.Getter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "order_details")
@Getter
@Setter
public class OrderDetails {

    @Id
    @Column(name = "order_details_id")
    private long id;

    @Column(name = "price", precision = 6, scale = 2)
    private Double totalPrice;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "orderDetails", cascade = CascadeType.ALL)
    private PaymentDetails paymentDetails;

    @OneToMany(mappedBy = "orderDetails", cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;

    public OrderDetails() {
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id){
        this.id = id;
    }
}
