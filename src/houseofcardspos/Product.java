/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofcardspos;

import java.math.BigDecimal;

/**
 *
 * @author Interact
 */
public class Product {
    
    public Product(){
        //nothing
    }

    public Product(int productID, BigDecimal price, String productName, int inventoryQuantity, String productDescription) {
        this.productID = productID;
        this.price = price;
        this.productName = productName;
        this.inventoryQuantity = inventoryQuantity;
        this.productDescription = productDescription;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    
    private int productID;
    private BigDecimal price;
    private String productName;
    private int inventoryQuantity;
    private String productDescription;
}
