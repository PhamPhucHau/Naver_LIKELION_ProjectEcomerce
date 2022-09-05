package com.example.Project_Ecommerce.Controller;

import com.example.Project_Ecommerce.Service.Cart_ItemService;
import com.example.Project_Ecommerce.entity.DTO.InfoCartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class GetItemOfCart {
    @Autowired
    Cart_ItemService cart_ItemService;
    @GetMapping("/get_item_of_cart/{customer_id}")
    public ResponseEntity<?> getItemOfCart(@PathVariable("customer_id") long customer_id, @RequestBody InfoCartItem infoCartItem)
    {
        return cart_ItemService.getItemOfCart(customer_id, infoCartItem);
    }
}
