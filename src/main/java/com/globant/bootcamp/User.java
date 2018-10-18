package com.globant.bootcamp;

/**
 *    This class represents a user, 
 *    which has an identification (id) and 
 *    a cart can be assigned to it.
 * 
 *    @author Axel Calas.
 */

public class User {
    private String id;
    private ShoppingCart cart;
    
    public User(String id) {
        this.id = id;
        cart = null;
    }
    
    public void assignCart(ShoppingCart cart){
        this.cart = cart;
    }
    
    public ShoppingCart getCart(){
        return cart;
    }
    
    public String getId(){
        return id;
    }
}
