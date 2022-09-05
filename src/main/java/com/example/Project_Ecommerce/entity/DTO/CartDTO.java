package com.example.Project_Ecommerce.entity.DTO;

import com.example.Project_Ecommerce.entity.Cart_Item;
import lombok.*;

import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CartDTO {
    private long cart_id;
    private Collection<Long> cardItem_id;
}
