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
    private long order_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "modified_at")
    private Date modified_at;

    @OneToOne(mappedBy = "orderItem",cascade = CascadeType.ALL , optional = false)
    private Product product;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setOrder_id(long order_id){
        this.order_id = order_id;
    }
}
