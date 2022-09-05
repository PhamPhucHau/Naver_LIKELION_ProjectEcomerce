package com.example.Project_Ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
@Data
@Entity
@Getter
@Service
@Table(name="CART_ITEM")

public class Cart_Item  {
    @EmbeddedId
    CartItemKey cartItemKey;

    @Column(name="QUANTITY_WISHED",nullable = false)
    private long quantity_wished;
    @Column(name="DATE_ADDED",nullable = false)
    private Date date_added;
    @Column(name="TOTAL_AMOUNT",nullable = false)
    private BigDecimal total_amount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)

    @JoinColumn(name = "CART_ID")
    @MapsId("card_id")
    @EqualsAndHashCode.Exclude
    @JsonBackReference
    private Cart cart;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    @MapsId("product_id")
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Product product;
    public void UpdateQuantity_wished(long quantity_wished)
    {
        this.quantity_wished+=quantity_wished;
        this.total_amount=product.getPrice().multiply(new BigDecimal(this.quantity_wished));
    }
}
