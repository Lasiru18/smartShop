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
public class WeighingItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "Item Code")
    private String itemCode;

    @Column(name = "Item Name")
    private String itemName;

    @Column(name = "Weight")
    private String weight;

    @Column(name = "1KG Price")
    private double kgPrice;

    @Column(name = "Expiration Date")
    private int exp;

}
