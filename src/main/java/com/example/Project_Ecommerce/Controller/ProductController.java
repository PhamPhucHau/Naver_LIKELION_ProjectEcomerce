package com.example.Project_Ecommerce.Controller;

import com.example.Project_Ecommerce.Service.ProductService;
import com.example.Project_Ecommerce.entity.DTO.ProductDTO;
import com.example.Project_Ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/get-all-product-condition")
    public ResponseEntity<List< ProductDTO>> getAllProduct(@RequestParam(name = "price")  String price, @RequestParam(name="condition") String condition)
    {
        ResponseEntity<List<ProductDTO>> response = null;
        List<ProductDTO> productDTOs=null;
       try {
          if(price.equals(null)||condition.equals(null))
          {
              throw new Exception("Input parameter is null");
          }
          if(!condition.equals("EQUAL")&&!condition.equals("GREATER_THAN")&&!condition.equals("LESS_THAN"))
          {
              throw new Exception("Invalid condition");
          }

           BigDecimal bigDecimal = new BigDecimal(price);
            productDTOs= productService.getAllProduct(bigDecimal, condition);
           response= new ResponseEntity<>(productDTOs, HttpStatus.OK);
       }
       catch (Exception e)
       {
           response=new  ResponseEntity<List<ProductDTO>>(productDTOs,HttpStatus.BAD_REQUEST);
       }
       return response;
    }
    @GetMapping(value = "/get-all-product")
    public ResponseEntity<List<Product>> getAllProduct()
    {
        return ResponseEntity.ok(productService.getAllProduct());
    }
}
