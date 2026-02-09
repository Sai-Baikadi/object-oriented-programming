package com.stschool.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputCustomerSignupData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a id");
        String id = sc.nextLine();
        System.out.println("Enter a firstName");
        String firstName = sc.nextLine();
        System.out.println("Enter a lastName");
        String lastName = sc.nextLine();
        System.out.println("Enter a email");
        String email = sc.nextLine();
        System.out.println("Enter a contactNo");
        String contactNo = sc.nextLine();
        System.out.println("Enter a password");
        String password = sc.next();

        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(firstName);
        customer.setEmail(email);
        customer.setContactNo(contactNo);
        customer.setPassword(password);


        return customer;


    }
}
