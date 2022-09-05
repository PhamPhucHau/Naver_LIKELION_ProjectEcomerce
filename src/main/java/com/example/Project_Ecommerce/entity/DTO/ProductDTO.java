package com.example.Project_Ecommerce.entity.DTO;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductDTO {
    private long product_id;
    private String product_name;
    private String type;
    private String size;
    private BigDecimal price;
}
