package com.globant.bootcamp;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class ShoppingCartImplTest {
    @Test
    public void whenNewShoppingCartThenProductsListIsEmpty(){
        ShoppingCartImpl cart = new ShoppingCartImpl();
        assertEquals(0,cart.listSize());
    }
    
    @Test
    public void aNewProductMustBeAddedToTheList(){
        ShoppingCartImpl cart = new ShoppingCartImpl();
        Product mockProduct = mock(Product.class);
        cart.addProduct(mockProduct);
        assertEquals(1,cart.listSize());
    }
    
    @Test
    public void aDeleteProductMustBeRemovedFromTheList(){
        ShoppingCartImpl cart = new ShoppingCartImpl();
        Product mockProduct = mock(ProductImpl.class);
        cart.addProduct(mockProduct);
        cart.deleteProduct(mockProduct);
        assertEquals(0,cart.listSize());
    }
}
