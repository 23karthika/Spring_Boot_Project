package com.loginpage.loginpage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductDetails {
    @Id
    private int productid;

    private String productName;
    private int productPrice;
    private int discount;

    public ProductDetails() {
    }
    
    public int getProductid() {
        return productid;
    }
    public void setProductid(int productid) {
        this.productid = productid;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

   
    
}
