package com.example.Project_Ecommerce.Service;

import com.example.Project_Ecommerce.entity.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;


public interface CustomerService {
    @PostConstruct
    public void InitCustomerData();
    public List<Customer> getAllCustomer();
}
