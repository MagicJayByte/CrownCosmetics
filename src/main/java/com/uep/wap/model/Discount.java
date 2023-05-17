package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="discount")
public class Discount {

    @Id
    @Column(name="disc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public Discount() {}

}
