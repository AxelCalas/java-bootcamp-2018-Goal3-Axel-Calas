package com.globant.bootcamp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductImplTest {
    @Test
    public void whenCreateProductThenSaveTheBrand(){
        Product product = new ProductImpl("Globant",0);
        assertEquals("Globant",product.getBrand());
    }
    
    @Test
    public void whenCreateProductThenSaveThePrice(){
        ProductImpl product = new ProductImpl("Globant",10.05);
        assertEquals(product.getPrice(),10.05,0.001);
    }
    
    @Test
    public void whenSetPriceThenMustChange(){
        Product product = new ProductImpl("Globant",10.05);
        product.setPrice(12.10);
        assertEquals(product.getPrice(),12.10,0.001); 
    }
}
