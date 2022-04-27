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
public class Shoplifter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Shoplifter ID")
    private String shoplifterID;

    @Column(name = "Shoplifter Name")
    private String shoplifterName;

    @Column(name = "Shoplifter Phone Number")
    private int shoplifterPN;

    @Column(name = "Delivery Item")
    private String deliveryItem;

}
