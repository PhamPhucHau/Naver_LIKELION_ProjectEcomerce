package com.example.Project_Ecommerce.entity.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoCartItem {
    private String nameOfProduct;
    private int offset;
    private int limit;
}
