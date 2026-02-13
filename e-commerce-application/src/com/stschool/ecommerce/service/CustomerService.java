package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

import java.util.Scanner;

public class CustomerService {
    public Customer handleInputSigUpData(Customer customer){
        System.out.println("handleInputSigUpData : " + customer);
        CustomerRepository customerRepository = new CustomerRepository();
        return customerRepository.addNewCustomer(customer);


    }
    public void displayCustomerDetail(Customer customer){
        System.out.println("id : " + customer.getId());
        System.out.println("firstName : " + customer.getFirstName());
        System.out.println("lastName : " + customer.getLastName());
        System.out.println("contactNo : " + customer.getContactNo());
        System.out.println("email : " + customer.getEmail());
        System.out.println("password : " + customer.getPassword());
    }
}

