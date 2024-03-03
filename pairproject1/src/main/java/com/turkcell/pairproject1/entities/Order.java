package com.turkcell.pairproject1.entities;

public class Order {
    private int id;
    private int customerId;
    private int productId;
    private int quantity;
    private double price;
    private String invoice;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private String paymentMethod;
    public Order(int a) {
        this.id = a;
        this.invoice = "Bu bir test";
    }

    public Order(int id, int customerId, int productId, int quantity, double price, String invoice , String paymentMethod) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.invoice = invoice;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", invoice='" + invoice + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
