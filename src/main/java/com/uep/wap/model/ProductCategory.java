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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public ProductCategory() {

    }

}
