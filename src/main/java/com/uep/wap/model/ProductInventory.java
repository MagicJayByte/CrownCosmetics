package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="product_inventory")
public class ProductInventory {

    @Id
    @Column(name="inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long inventoryId;

    @Column(name="quantity")
    private int quantity;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @Column(name="deleted_at")
    private Timestamp deletedAt;

    @OneToMany(mappedBy = "productInventory", cascade = CascadeType.ALL)
    private List<Product> products;

    public ProductInventory() {
    }
}

