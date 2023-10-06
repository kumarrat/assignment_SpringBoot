package com.geekster.Restaurant.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Odr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String status;
}
