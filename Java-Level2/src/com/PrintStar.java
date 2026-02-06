package com;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<n-i+1;) {
                System.out.print(" * ");
            }
            for (int k = 1; k<i*2; k++) {
                System.out.print("  ");

            }
            for (int l = 1; l<i*2; l++) {
                    System.out.print(" ");
                }
                for (int k = n; k>i; k--) {
                    System.out.print("* ");
                    System.out.println();
                    sc.close();
                }
            }
        }
    }

