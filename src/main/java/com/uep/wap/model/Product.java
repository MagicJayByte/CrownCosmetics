package com.uep.wap.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name="prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prodId;

    @Column(name="name")
    private String name;

    @Column(name="desc")
    private String desc;

    @Column(name="SKU")
    private String sku;

    @Column(name="price")
    private float price;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @OneToOne
    @JoinColumn(name = "cart_item_id")
    private CartItem cartItem;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderItems orderItem;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private ProductInventory productInventory;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "prod_disc", joinColumns = @JoinColumn(name = "disc_id"), inverseJoinColumns = @JoinColumn(name = "prod_id"))
    private List<Discount> discounts;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "prod_cat", joinColumns = @JoinColumn(name = "prod_id"), inverseJoinColumns = @JoinColumn(name = "cat_id"))
    private List<ProductCategory> productCategories;

    public Product() { }

}
