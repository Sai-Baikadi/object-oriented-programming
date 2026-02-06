package com.stschool.java.oop;

public class Product {
    int id=100;
    String name;
    double price;
     Product( int id,String name, double price){
         this.id=id;
         this.name=name;
         this.price=price;
     }
       void displayProductDetails(){
         System.out.println("id:" + id);
         System.out.println("name:" + name);
         System.out.println("price:" + price);

       }

}
