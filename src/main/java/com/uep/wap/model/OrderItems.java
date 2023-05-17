package com.uep.wap.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class OrderItems {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "modified_at")
    private Date modified_at;

    @OneToOne(mappedBy = "orderItem",cascade = CascadeType.ALL , optional = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_details_id")
    private OrderDetails orderDetails;

}
