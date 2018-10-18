package com.globant.bootcamp;

import java.util.ArrayList;

public class ShoppingCartImpl implements ShoppingCart {
    private ArrayList<Product> productsInCart;
    
    public ShoppingCartImpl(){
       productsInCart = new ArrayList<Product>();
    }
    
    public int listSize() {
        return productsInCart.size();
    }
    
    @Override
    public void showCart(){
        if(productsInCart == null || productsInCart.isEmpty()){
            System.out.println("There are no products in the cart\n");
        } else {
            for (int i = 0; i < productsInCart.size(); i++) {
                System.out.println(productsInCart.get(i));
                System.out.println("Brand: " + productsInCart.get(i).getPrice());
                System.out.println("Price: " + productsInCart.get(i).getPrice() + "\n");
            }
        }
    }
    
    @Override
    public void addProduct(Product product){
        productsInCart.add(product);
    }
    
    @Override
    public void deleteProduct(Product product){
        for (int i = 0; i < productsInCart.size(); i++) {
            if(productsInCart.get(i) == product) {
                productsInCart.remove(i);
            }
        }
    }
    
    @Override
    public double getAmmount(){
        double ammount = 0;
        for (int i = 0; i < productsInCart.size(); i++) {
            ammount = ammount + productsInCart.get(i).getPrice();
        }
        return ammount;
    }
    
    @Override
    public void confirmPurchase(){
        System.out.println("Purchase made");
    }
}
