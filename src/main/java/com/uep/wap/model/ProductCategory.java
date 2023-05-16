package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="cat_id")

public class ProductCategory {

    @Id
    @Column(name="cat_id")
    private long catId;

    @Column(name="name")
    private String name;

    @Column(name="desc")
    private String desc;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {this.catId = id;}

    public ProductCategory() {

    }

    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
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
