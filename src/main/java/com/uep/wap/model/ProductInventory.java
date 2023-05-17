package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="product_inventory")
public class ProductInventory {

    @Id
    @Column(name="inventory_id")
    private long inventoryId;

    @Column(name="quantity")
    private int quantity;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @Column(name="deleted_at")
    private Timestamp deletedAt;

    @OneToMany(mappedBy = "product_inventory", cascade = CascadeType.ALL)
    private List<Product> products;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {this.inventoryId = id;}

    public ProductInventory() { }

    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
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

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}

