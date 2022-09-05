package com.example.Project_Ecommerce.Service;

import com.example.Project_Ecommerce.Repository.MyBatisRepository;
import com.example.Project_Ecommerce.entity.DTO.CartItemProductDTO;
import com.example.Project_Ecommerce.entity.DTO.InfoCartItem;
import com.example.Project_Ecommerce.entity.DTO.ItemDTO;
import com.example.Project_Ecommerce.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Service
public interface Cart_ItemService {

    public ResponseEntity<String> updateItemDTO(long customerId,ItemDTO itemDTO);
    public ResponseEntity<List<CartItemProductDTO>> getItemOfCart(long customerId, InfoCartItem infoCartItem );

}
