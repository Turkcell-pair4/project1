package com.turkcell.pairproject1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "ADRESS", length = 500, nullable = false)
    private String address;

    @Column(name = "PAYMENT_METHOD", length = 100, nullable = false)
    private String paymentMethod;

    @ManyToOne()
    @JoinColumn(name = "SELLER_ID", nullable = false)
    private Seller seller;
}
