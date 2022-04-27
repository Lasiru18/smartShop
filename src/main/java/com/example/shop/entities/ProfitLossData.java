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
public class ProfitLossData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Item Code")
    private String itemCode;

    @Column(name = "Item Name")
    private String itemName;

    @Column(name = "Input Item Quantity")
    private int inputItemQuantity;

    @Column(name = "1 Item Price Put In Shop")
    private double pricePutInShop;

    @Column(name = "1 Item Selling Price")
    private double sellingPrice;

    @Column(name = "Sold Item Quantity")
    private int soldItemQuantity;

    @Column(name = "Period")
    private String period;

    @Column(name = "Profit Or Loss In Rupees")
    private double profitOrLoss;

}
