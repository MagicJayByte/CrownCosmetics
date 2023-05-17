package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="discount")
public class Discount {

    @Id
    @Column(name="disc_id")
    private long discId;

    @Column(name="name")
    private String name;

    @Column(name="desc")
    private String desc;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @Column(name="deleted_at")
    private Timestamp deletedAt;

    @Column(name="disc_percent")
    private float discPercent;

    @Column(name="active")
    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {this.discId = id;
    }

    public Discount() {}


    public long getDiscId() {
        return discId;
    }

    public void setDiscId(long discId) {
        this.discId = discId;
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

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public float getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(float discPercent) {
        this.discPercent = discPercent;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
