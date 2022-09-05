package com.example.Project_Ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Setter
@Getter
public class CartItemKey implements Serializable {
    @Column(name = "CART_ID")
    private long card_id;
    @Column(name = "PRODUCT_ID")
    private long product_id;

    public CartItemKey(long cart_id, long product_id) {
        this.card_id=cart_id;
        this.product_id=product_id;
    }

    public CartItemKey() {

    }
}
