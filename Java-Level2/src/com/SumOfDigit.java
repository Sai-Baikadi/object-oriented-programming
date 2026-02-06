package com;

import java.security.PublicKey;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int sum = 0;
        int digit;
        while(number>0){
            digit = number%10;
            sum = sum +digit;
            number = number/10;
            System.out.println("sum is : " + sum);
        }
    }
}
