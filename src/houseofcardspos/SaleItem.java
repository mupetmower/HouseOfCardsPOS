package houseofcardspos;

import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Interact
 */
public class SaleItem {
    public SaleItem(){
        //nothing
    }
    
    public SaleItem(int quantity, Product p) {        
        this.quantity = quantity;
        this.p = p;
        this.p.setInventoryQuantity(p.getInventoryQuantity()-1);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return p;
    }

    public void setProduct(Product p) {
        this.p = p;
    }
    
    public int getProductID(){
        return p.getProductID();
    }
    
    public BigDecimal getPrice(){
        return p.getPrice();
    }
    
    public String getProductName(){
        return p.getProductName();
    }
    
    public String getDescription(){
        return p.getProductDescription();
    }
    
    public int getInventoryQuantity(){
        return p.getInventoryQuantity();
    }
    public void setInventoryQuantity(int q){
        p.setInventoryQuantity(q);
    }
    

    private int quantity;
    private Product p;
}
