package com.example.Project_Ecommerce.Service.Impl;

import com.example.Project_Ecommerce.Repository.MyBatisRepository;
import com.example.Project_Ecommerce.Repository.ProductRepository;
import com.example.Project_Ecommerce.Service.ProductService;
import com.example.Project_Ecommerce.entity.DTO.ProductDTO;
import com.example.Project_Ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Resource
    MyBatisRepository myBatisRepository;
    @Override
    @PostConstruct
    public void InitProductData() {
        BigDecimal bd1 =
                new BigDecimal("225000.00");
        Product product1=new Product("Sữa Vinamilk","MIK","M",bd1);
        productRepository.save(product1);
        BigDecimal bd2 = new BigDecimal("220000.00");
        Product product2=new Product("Sữa Cô gái Hà Lan","MIK","M",bd2);
        productRepository.save(product2);
        BigDecimal bd3 = new BigDecimal("200000.00");
        Product product3=new Product("Sữa TH TRUE MILK","MIK","M",bd3);
        productRepository.save(product3);
        BigDecimal bd4 = new BigDecimal("200000.00");
        Product product4=new Product("Sữa Yomost","MIK","M",bd4);
        productRepository.save(product4);
        BigDecimal bd5 = new BigDecimal("180000.00");
        Product product5=new Product("Sữa Đậu nành VinaFarm","MIK","M",bd5);
        productRepository.save(product5);
        BigDecimal bd6 = new BigDecimal("170000.00");
        Product product6=new Product("Sữa Vinamilk","MIK","M",bd6);
        productRepository.save(product6);
        BigDecimal bd7 = new BigDecimal("2600000.00");
        Product product7=new Product("Sữa Vinamilk","MIK","M",bd7);
        productRepository.save(product7);
        BigDecimal bd8 = new BigDecimal("170000.00");
        Product product8=new Product("Sữa Vinasoy","MIK","M",bd8);
        productRepository.save(product8);
        BigDecimal bd9 = new BigDecimal("170000.00");
        Product product9=new Product("Sữa Vinamilk hạt óc chó","MIK","M",bd9);
        productRepository.save(product9);
        BigDecimal bd10 = new BigDecimal("150000.00");
        Product product10=new Product("Sữa Vinamilk hạt dẻ","MIK","M",bd10);
        productRepository.save(product10);

    }
    public List< ProductDTO> getAllProduct(BigDecimal price, String condition)
    {
        switch (condition)
        {
            case "LESS_THAN":
            {
                return myBatisRepository.getAllProductLessThen(price);

            }
            case "GREATER_THAN":
            {
                return myBatisRepository.getAllProductGreaterThen(price);

            }
            case "EQUAL":
            {
                return myBatisRepository.getAllProductEqual(price);

            }
            default:{
                throw new IllegalArgumentException("Invalid condition");
            }
        }
    }
    public List<Product> getAllProduct()
    {
       return productRepository.findAll();
    }
}
