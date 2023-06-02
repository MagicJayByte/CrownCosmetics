package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="discount")
public class Discount {

    @Id
    @Column(name="disc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long discId;

    @Column(name="name")
    private String name;

    @Column(name="description")
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

    @ManyToMany(mappedBy = "discounts")
    private List<Product> products;


    public Discount() {}

}
