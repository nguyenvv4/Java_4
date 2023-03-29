package com.example.sof3011_demo.cart.entity;

public class CartItem {

    private Integer productId;
    private String productName;
    private int quantity=1;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CartItem(Integer productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public CartItem() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
