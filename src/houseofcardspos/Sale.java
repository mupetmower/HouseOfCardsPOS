/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofcardspos;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Interact
 */
public class Sale {
    public Sale(){
        //nothing
    };

    public Sale(ArrayList<SaleItem> saleItems, BigDecimal saleTotal, String date) {
        this.saleItems = saleItems;
        this.date = date;
        this.saleTotal = saleTotal;
    }

    public ArrayList<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(ArrayList<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(BigDecimal saleTotal) {
        this.saleTotal = saleTotal;
    }
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private ArrayList<SaleItem> saleItems;
    private String date;
    private BigDecimal saleTotal;
}
