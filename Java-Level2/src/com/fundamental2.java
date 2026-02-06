package com;

import java.util.Scanner;

public class fundamental2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int reverse = 0;
        int digit;
        while(number>0){
            digit = number%10;
            reverse = reverse*10+digit;
            number = number/10;

            System.out.println("reverse is : " + reverse);
        }
    }

}
