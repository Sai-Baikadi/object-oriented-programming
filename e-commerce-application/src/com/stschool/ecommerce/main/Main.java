package com.stschool.ecommerce.main;

import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.service.CustomerService;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SigUp");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer  = new Customer();
                 customer = customerMenu.inputSigUpData();
                 CustomerController customerController = new CustomerController();
                 Customer newCustomer = customerController.handleInputSigUpData(customer);
                CustomerService customerService = new CustomerService();
                customerService.displayCustomerDetail(newCustomer);
                break;



        }
    }
}
