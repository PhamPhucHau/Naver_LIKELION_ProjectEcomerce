package com.example.Project_Ecommerce.entity.DTO;

import com.example.Project_Ecommerce.entity.CartItemKey;

import java.math.BigDecimal;
import java.util.Date;

public class CartItemDTO {
    CartItemKey cartItemKey;
    private long quantity_wished;
    private Date date_added;
    private BigDecimal total_amount;
    private long card_id;
    private long product_id;
}
