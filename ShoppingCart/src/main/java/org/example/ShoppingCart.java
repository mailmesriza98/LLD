package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShoppingCart {
    public static void main(String[] args) {
        Product p1=new Product("bag", 100);
        Product p2=new Product("cream", 500);
        Product p3=new Product("fruits",200);
        Product p4=new Product("clothes",1000);

        Customer c1=new Customer("John");


        c1.addToCart(p1);
        c1.addToCart(p2);
        c1.addToCart(p3);
        c1.addToCart(p4);
        c1.buy();
        c1.removeFromCart(p1);
        c1.buy();
    }
}