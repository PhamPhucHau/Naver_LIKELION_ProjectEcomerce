package com.example.Project_Ecommerce.Controller;

import com.example.Project_Ecommerce.Service.Cart_ItemService;
import com.example.Project_Ecommerce.entity.Cart;
import com.example.Project_Ecommerce.entity.CartItemKey;
import com.example.Project_Ecommerce.entity.DTO.ItemDTO;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(name="cart")
public class CartController {
    @Autowired
    Cart_ItemService cart_itemService;
    @GetMapping("/addItemToCart/{customerId}")
    public ResponseEntity<List<String>> addItemToCart(@PathVariable("customerId") long customerId, @RequestBody List<ItemDTO> listItem)
    {
        List<String> response=null;
        for(ItemDTO itemDTO:listItem)
        {
            response.add(cart_itemService.updateItemDTO(customerId,itemDTO).getBody());
        }
        return ResponseEntity.ok().body(response);
    }

}
