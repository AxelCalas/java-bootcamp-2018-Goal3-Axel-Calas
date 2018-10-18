package com.globant.bootcamp;

/**      This class represents a shopping cart 
 *       belonging to a user, which can be add products
 *       to a list, remove them, see the ammount, and  
 *       then confirm the purchase.
 *
 *       @author Axel Calas.        
 */
interface ShoppingCart {
    
    /**
     *  This method show the products in the cart.
     */
    public void showCart();
    
    /**
     *  You can add products to the cartList by parameter
     *  @param product to add.
     */
    public void addProduct(Product product);
    
    /**
     *  You can remove products to the cartList by parameter
     *  @param product to remove.
     */
    public void deleteProduct(Product product);
    
    /**
     *  You can get the ammount to pay with this method.
     *  @return ammount to pay.
     */
    public double getAmmount();
    
    public void confirmPurchase();
 }