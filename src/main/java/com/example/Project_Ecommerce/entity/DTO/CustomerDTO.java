package com.example.Project_Ecommerce.entity.DTO;

import lombok.Data;

@Data
public class CustomerDTO {
    private long customer_id;
    private String customer_name;
    private String adress;
    private String phonenumber;
    private long card_id;
}
