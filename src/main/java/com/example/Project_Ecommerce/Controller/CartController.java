package com.example.Project_Ecommerce.Controller;

import com.example.Project_Ecommerce.Service.Cart_ItemService;
import com.example.Project_Ecommerce.entity.Cart;
import com.example.Project_Ecommerce.entity.CartItemKey;
import com.example.Project_Ecommerce.entity.DTO.ItemDTO;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    Cart_ItemService cart_itemService;
    @PostMapping ("/addItemToCart/{customerId}")
    public ResponseEntity<List<String>> addItemToCart(@PathVariable("customerId") long customerId, @RequestBody List<ItemDTO> listItem)
    {
        List<String> response = new ArrayList<>();
        try {

            for (ItemDTO itemDTO : listItem) {
                response.add(cart_itemService.updateItemDTO(customerId, itemDTO).getBody());
            }
            return ResponseEntity.status(HttpStatus.OK).body((response));
        }
        catch (Exception e)
        {
            response.add(e.getMessage());
            return ResponseEntity.status(HttpStatus.OK).body((response));
        }
    }

}
