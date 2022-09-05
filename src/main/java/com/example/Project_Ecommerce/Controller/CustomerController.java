package com.example.Project_Ecommerce.Controller;

import com.example.Project_Ecommerce.Service.CustomerService;
import com.example.Project_Ecommerce.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("")
    public ResponseEntity<List<Customer>> getAllCustomer()
    {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomer());
    }
}
