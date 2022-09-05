package com.example.Project_Ecommerce.Repository;

import com.example.Project_Ecommerce.entity.CartItemKey;
import com.example.Project_Ecommerce.entity.Cart_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cart_ItemRepository extends JpaRepository<Cart_Item, CartItemKey> {

}
