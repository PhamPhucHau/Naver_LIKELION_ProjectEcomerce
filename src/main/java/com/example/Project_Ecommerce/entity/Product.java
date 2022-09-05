package com.example.Project_Ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name="PRODUCT")
@Data
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    @Column(name="PRODUCT_ID")
    private long product_id;
    @Column(name="PRODUCT_NAME")
    private String product_name;
    @Column(name="TYPE",length = 3)
    private String type;
    @Column(name="SIZE",length = 3)
    private String size;
    @Column(name="PRICE",nullable = false)
    private BigDecimal price;
    @OneToMany(mappedBy = "product")
    private Collection<Cart_Item> cart_items;
    public Product()
    {

    }
    public Product(String product_name,String type,String size,BigDecimal price)
    {
        this.product_name=product_name;
        this.type=type;
        this.size=size;
        this.price=price;
    }
}
