package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputSigUpData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        String id = sc.next();
        System.out.println("Enter firstName");
        String firstName = sc.next();
        System.out.println("Enter lastName");
        String lastName = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter ContactNo");
        String contactNo = sc.next();
        System.out.println("password");
        String password = sc.next();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setContactNo(contactNo);
        customer.setPassword(password);

        return customer;
    }
}
