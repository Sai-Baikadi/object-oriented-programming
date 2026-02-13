package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {
    public Customer handleInputSigUpData(Customer customer){
        System.out.println("handleInputSigUpData : " + customer);
        CustomerService customerService = new CustomerService();
        return customerService.handleInputSigUpData(customer);




    }
}
