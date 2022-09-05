package com.example.Project_Ecommerce.Service.Impl;

import com.example.Project_Ecommerce.Repository.*;
import com.example.Project_Ecommerce.Service.Cart_ItemService;
import com.example.Project_Ecommerce.entity.*;
import com.example.Project_Ecommerce.entity.DTO.CartItemProductDTO;
import com.example.Project_Ecommerce.entity.DTO.InfoCartItem;
import com.example.Project_Ecommerce.entity.DTO.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class Cart_ItemServiceImpl implements Cart_ItemService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    Cart_ItemRepository cart_itemRepository;
    @Resource
    MyBatisRepository myBatisRepository;
    @Override
    public ResponseEntity<String> updateItemDTO(long customerId,ItemDTO itemDTO)
    {
            Customer customer=customerRepository.findById(customerId).orElse(null);
            if(customer==null)
            {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid customer id");
            }
            if(customer.getCart()==null)
            {
                Cart cart=new Cart();
                cartRepository.save(cart);
                customer.setCart(cart);
            }
            Date date=new Date();
            //Checking product

            Product product=productRepository.findById(itemDTO.getProductId()).orElse(null);
            if(product==null)
            {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid product id");
            }
            if(itemDTO.getQuantity()<=0)
            {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid quantity ");
            }
            //Check cart Item
            Cart_Item cart_item=cart_itemRepository.findById(new CartItemKey(customer.getCart().getCart_id(),product.getProduct_id())).orElse(null);
            if(cart_item==null)
            {
                BigDecimal total = new BigDecimal(itemDTO.getQuantity());
                total = total.multiply(product.getPrice());
                cart_item=new Cart_Item();
                cart_item.setCartItemKey(new CartItemKey(customer.getCart().getCart_id(),product.getProduct_id()));
                cart_item.setCart(customer.getCart());
                cart_item.setProduct(product);
                cart_item.setDate_added(date);
                cart_item.setQuantity_wished(itemDTO.getQuantity());
                cart_item.setTotal_amount(total);
            }
            else
            {
                cart_item.UpdateQuantity_wished(itemDTO.getQuantity());
            }
            Cart_Item cart_item_update= cart_itemRepository.save(cart_item);

            return ResponseEntity.status(HttpStatus.OK).body("Success"+cart_item_update.toString());
        }
        @Override
    public ResponseEntity<?> getItemOfCart(long customerId, InfoCartItem infoCartItem )
    {
        List<CartItemProductDTO> listCartItemProduct=myBatisRepository.getCartItemProduct(customerId,infoCartItem.getNameOfProduct(),infoCartItem.getOffset(),infoCartItem.getLimit());
        return ResponseEntity.ok().body(listCartItemProduct);
    }
}
