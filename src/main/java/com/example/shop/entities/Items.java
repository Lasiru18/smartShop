package com.example.shop.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Item Code")
    private String itemCode;

    @Column(name = "Item Name")
    private String itemName;

    @Column(name = "price")
    private Double price;

    @Column(name = "Expiration Date")
    private int exp;

    @Column(name = "Quantity")
    private int quantity;


}
