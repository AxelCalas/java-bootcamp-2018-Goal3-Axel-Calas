package com.globant.bootcamp;

public class ProductImpl implements Product {
    private double price;
    private String brand;
    
    public ProductImpl(String brand,double price){
        this.price = price;
        this.brand = brand;
    }
    
    @Override
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public double getPrice(){
        return price;        
    }
    
    @Override
    public String getBrand(){
        return brand;        
    }
}
