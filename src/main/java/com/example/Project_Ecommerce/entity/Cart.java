package com.example.Project_Ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name="CART")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue
    @Column(name = "CART_ID")
    private long cart_id;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Collection<Cart_Item> cart_items;

}
