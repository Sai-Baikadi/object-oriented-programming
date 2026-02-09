package com.stschool.main;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ui.CustomerMenu;
import com.stschool.ecommerce.controller.CustomerController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SignUp ");
        System.out.println("Enter  your choice");
        int choice=sc.nextInt();
         switch (choice)
         {
             case 1:
                 CustomerMenu customerMenu = new CustomerMenu();
                 Customer customer = new Customer();
                 customer= customerMenu.inputCustomerSignupData();
                 CustomerController customerController = new CustomerController();
                 customerController.handleSigUpDataCustomer(customer);

         }
    }
}
