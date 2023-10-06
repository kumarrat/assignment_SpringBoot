package com.geekster.Restaurant.Management.repo;

import com.geekster.Restaurant.Management.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
