package com.globant.bootcamp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class UserTest { 
    @Test
    public void whenCreateUserThenSaveId(){
        User user = new User("us0001");
        assertEquals(user.getId(),"us0001");
    }
    
    @Test
    public void whenAssignACartThenIsSaved(){
        User user = new User("us0001");
        ShoppingCartImpl mockCart = mock(ShoppingCartImpl.class);
        user.assignCart(mockCart);
        assertEquals(user.getCart(),mockCart);
    }

}
