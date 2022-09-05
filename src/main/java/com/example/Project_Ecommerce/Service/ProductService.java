package com.example.Project_Ecommerce.Service;

import com.example.Project_Ecommerce.entity.DTO.ProductDTO;
import com.example.Project_Ecommerce.entity.Product;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    @PostConstruct
    public void InitProductData();
    List< ProductDTO> getAllProduct(BigDecimal price, String condition);
    List<Product> getAllProduct();
}
