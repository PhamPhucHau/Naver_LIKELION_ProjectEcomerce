package com.example.Project_Ecommerce.entity.DTO;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItemProductDTO {
    private long product_id;
    private String product_name;
    private String type;
    private String size;
    private BigDecimal price;
    private long quantity_wished;
    private Date date_added;
    private BigDecimal total_amount;
    private long card_id;
}
