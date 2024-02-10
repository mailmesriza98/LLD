package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //list of products
    //add
    //remove

    List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void removeProduct(Product p){
        this.products.remove(p);
    }
}
