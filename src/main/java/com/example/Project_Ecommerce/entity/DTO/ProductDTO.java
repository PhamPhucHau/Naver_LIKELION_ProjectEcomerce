package com.example.Project_Ecommerce.entity.DTO;

import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductDTO {
    private long product_id;
    private String product_name;
    private String type;
    private String size;
    private BigDecimal price;
}
