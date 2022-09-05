package com.example.Project_Ecommerce.Service;

import com.example.Project_Ecommerce.entity.DTO.InfoCartItem;
import com.example.Project_Ecommerce.entity.DTO.ItemDTO;
import org.springframework.http.ResponseEntity;

public interface Cart_ItemService {

    public ResponseEntity<String> updateItemDTO(long customerId,ItemDTO itemDTO);
    public ResponseEntity<?> getItemOfCart(long customerId, InfoCartItem infoCartItem );

}
