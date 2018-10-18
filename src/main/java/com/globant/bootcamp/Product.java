package com.globant.bootcamp;

/**
 * This class represents a product that has a brand 
 * and a price, established when it is created. Then it is also possible  
 * to change the price of the products and obtain the price.
 * 
 *  @author Axel Calas
 */

interface Product {
    public void setPrice(double price);
    public double getPrice();
    public String getBrand();
}
