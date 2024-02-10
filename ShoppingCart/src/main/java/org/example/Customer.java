package org.example;

import java.util.List;

public class Customer {

    private String name;
    private Cart cart;
    //addToCart
    //removefromCart
    //buy

    private int totalDue;


    public Customer(String name) {
        this.name = name;
        this.cart=new Cart();
    }

    public void addToCart(Product p){
        cart.addProduct(p);
    }

    public void removeFromCart(Product p){
        cart.removeProduct(p);
    }

    public void buy(){
        List<Product> products=this.cart.getProducts();
        this.totalDue=0;
        for(Product p:products){
            this.totalDue+=p.getPrice();
        }
        System.out.println("total amount due for "+this.name+" is "+this.totalDue);

    }


}
