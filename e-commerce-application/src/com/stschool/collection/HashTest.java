package com.stschool.collection;

import com.stschool.ecommerce.model.Customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashTest {
    static void main() {
        HashSet<Product> productHashSet  = new HashSet<>();
        productHashSet.add(new Product(" 1022","labtop",50000,4500.45));
        productHashSet.add(new Product("6616","mobile",25000,65.12));

        System.out.println(productHashSet.size());
        Iterator<Product> productIterator = productHashSet.iterator();
        while (productIterator.hasNext()){
            System.out.println(productIterator.next());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        String productid = sc.next();

        Iterator<Product> productIterator1 = productHashSet.iterator();
        while (productIterator.hasNext()){
              Product p = productIterator1.next();
              if(p.getId().equals(productid)){
                  productIterator1.remove();
              }
        }
        System.out.println("Product after removing");
        System.out.println(productHashSet.size());
        sc.close();
    }
    }

