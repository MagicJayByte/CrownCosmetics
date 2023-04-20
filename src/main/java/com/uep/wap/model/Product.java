package com.uep.wap.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name="prod_id")
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {this.prodId = id;}

    public Product() { }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
