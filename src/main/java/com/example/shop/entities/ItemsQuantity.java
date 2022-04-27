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
public class ItemsQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Item Code")
    private String itemCode;

    @Column(name = "Item Name")
    private String itemName;

    @Column(name = "Input Quantity")
    private int inQuantity;

    @Column(name = "Sold Quantity")
    private int soldQuantity;

    @Column(name = "Now Stock Quantity")
    private int nowStockQuantity;

}
