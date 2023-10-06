package com.geekster.Restaurant.Management.controller;

import com.geekster.Restaurant.Management.model.FoodItem;
import com.geekster.Restaurant.Management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;


    @PostMapping("FoodItem")
    public String addFoodItem(@RequestBody FoodItem newFoodItem)
    {
        return foodItemService.saveFoodItem(newFoodItem);
    }

    @GetMapping("FoodItems")
    public List<FoodItem> getFoodItem()
    {
        return foodItemService.getFoodItem();
    }

    @DeleteMapping("FoodItem/{id}")
    public String removeFoodItem(@PathVariable Long id)
    {
        return foodItemService.removeFoodItem(id);
    }

    @GetMapping("foodItem/{id}/id")
    public FoodItem getFoodItemById(@PathVariable Long id)
    {
        return foodItemService.getFoodItemById(id);
    }
}
