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
}
