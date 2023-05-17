package com.uep.wap.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "cart_item")
public class CartItem {

    @Id
    @Column(name="cart_item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartItemId;



    @Column(name="quanity")
    private int quantity;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @OneToOne(mappedBy = "cartItem", cascade = CascadeType.ALL)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private ShoppingSession shoppingSession; 

    public CartItem() {}
    
}
