package com.example.Project_Ecommerce.entity.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ItemDTO {
    private long productId;
    private long quantity;
}
