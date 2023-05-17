package com.uep.wap.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "cart_item")
public class CartItem {

    @Id
    @Column(name="cart_item_id")
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) { this.cartItemId = id;

    }




    public CartItem() {

    }

    public long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
