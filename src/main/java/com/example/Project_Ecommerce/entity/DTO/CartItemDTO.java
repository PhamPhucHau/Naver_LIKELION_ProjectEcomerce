package com.example.Project_Ecommerce.entity.DTO;

import com.example.Project_Ecommerce.entity.CartItemKey;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItemDTO {
    CartItemKey cartItemKey;
    private long quantity_wished;
    private Date date_added;
    private BigDecimal total_amount;
    private long card_id;
    private long product_id;
}
