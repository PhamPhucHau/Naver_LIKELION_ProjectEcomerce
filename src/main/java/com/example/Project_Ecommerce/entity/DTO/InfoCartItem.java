package com.example.Project_Ecommerce.entity.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InfoCartItem {
    private String nameOfProduct;
    private int offset;
    private int limit;
}
