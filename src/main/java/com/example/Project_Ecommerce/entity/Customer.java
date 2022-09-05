package com.example.Project_Ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name="CUSTOMER")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue
    @Column(name="CUSTOMER_ID",nullable = false)
    private long customer_id;
    @Column(name="CUSTOMER_NAME",length = 50,nullable = false)
    private String customer_name;
    @Column(name="ADDRESS",nullable = true,length = 100)
    private String address;
    @Column(name="PHONE_NUMBER",nullable = false,length = 20)
    private String phone_no;
    @OneToOne
    @JoinColumn(name="cart_id")
    private Cart cart;
    public Customer()
    {

    }
    public Customer(String customer_name,String address,String phone_no)
    {
        this.customer_name=customer_name;
        this.address=address;
        this.phone_no=phone_no;
    }

}
