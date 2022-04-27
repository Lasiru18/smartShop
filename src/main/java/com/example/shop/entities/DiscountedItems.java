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
public class DiscountedItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Item Code")
    private String itemCode;

    @Column(name = "Item Name")
    private String itemName;

    @Column(name = "Normal Price")
    private double normalPrice;

    @Column(name = "Discount")
    private double discount;

    @Column(name = "Discount Price")
    private double discountPrice;

    @Column(name = "Expiration Date")
    private int exp;

    @Column(name = "Quantity")
    private int quantity;

}
