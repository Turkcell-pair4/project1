package com.turkcell.pairproject1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "SELLERS")
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "PHONE_NUMBER", length = 100, nullable = false)
    private String phoneNumber;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "SELLER_EMAIL", length = 100, nullable = false)
    private String email;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products;

    @Column(name = "ADDRESS", length = 100, nullable = false)
    private String address;


    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Order>orderList;
}
