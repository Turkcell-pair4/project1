package com.turkcell.pairproject1.entities;


public class Seller {

    private Long id;

    private String phoneNumber;
    private String name;
    private String email;
    private Long productId;
    private String address;

    public Seller(Long id, String phoneNumber, String name, String email, Long productId, String address) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.productId = productId;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seller() {
    }

}
