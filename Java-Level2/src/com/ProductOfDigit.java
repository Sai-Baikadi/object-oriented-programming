package com;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int product = 1;
        int digit ;
        while(number>0){
            digit = number%10;
            product = product*digit;
            number = number/10;
            System.out.println("product is : " + product);
        }
    }
}
