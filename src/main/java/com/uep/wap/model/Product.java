package com.uep.wap.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name="prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prodId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String desc;

    @Column(name="SKU")
    private String sku;

    @Column(name="price")
    private float price;

    @Column(name="prod_image")
    private String prodImage;


    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;


    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private CartItem cartItem;


    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    private OrderItems orderItem;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private ProductInventory productInventory;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "prod_disc", joinColumns = @JoinColumn(name = "prod_id"), inverseJoinColumns = @JoinColumn(name = "disc_id"))
    private List<Discount> discounts;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "prod_cat", joinColumns = @JoinColumn(name = "prod_id"), inverseJoinColumns = @JoinColumn(name = "cat_id"))
    private List<ProductCategory> productCategories;

    public Product() { }

}
