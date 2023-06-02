package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="product_category")

public class ProductCategory {

    @Id
    @Column(name="cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long catId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String desc;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="modified_at")
    private Timestamp modifiedAt;

    @ManyToMany(mappedBy = "productCategories")
    private List<Product> products;


    public ProductCategory() {

    }

}
