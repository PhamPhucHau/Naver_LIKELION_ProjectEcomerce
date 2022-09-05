package com.example.Project_Ecommerce.Service.Impl;

import com.example.Project_Ecommerce.Repository.CustomerRepository;
import com.example.Project_Ecommerce.Service.CustomerService;
import com.example.Project_Ecommerce.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @PostConstruct
    public void InitCustomerData() {
        Customer customer1=new Customer("Pham Phuc Hau1","KTX khu A, Linh Trung, Thu Duc, HCM","036879456432");
        customerRepository.save(customer1);
        Customer customer2=new Customer("Pham Phuc Hau2","KTX khu A, Linh Trung, Thu Duc, HCM","036879456432");
        customerRepository.save(customer2);
        Customer customer3=new Customer("Pham Phuc Hau3","KTX khu A, Linh Trung, Thu Duc, HCM","036879456432");
        customerRepository.save(customer3);
        Customer customer4=new Customer("Pham Phuc Hau4","KTX khu A, Linh Trung, Thu Duc, HCM","036879456432");
        customerRepository.save(customer4);
        Customer customer5=new Customer("Pham Phuc Hau5","KTX khu A, Linh Trung, Thu Duc, HCM","036879456432");
        customerRepository.save(customer5);

    }
    @Override
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }
}
