package com.geekster.Restaurant.Management.service;

import com.geekster.Restaurant.Management.model.FoodItem;
import com.geekster.Restaurant.Management.repo.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo foodItemRepo;

    public String saveFoodItem(FoodItem newFoodItem) {
        foodItemRepo.save(newFoodItem);
        return "FoodItem Added";
    }

    public List<FoodItem> getFoodItem() {
        return foodItemRepo.findAll();
    }

    public String removeFoodItem(Long id) {
        foodItemRepo.deleteById(id);
        return "FoodItem Removed";
    }

    public FoodItem getFoodItemById(Long id) {
        return foodItemRepo.findById(id).orElseThrow();
    }
}
