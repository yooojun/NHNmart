package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {
    @Test
    @DisplayName("Food Construct Test")
    void foodConstructTest(){
        Food food = new Food("양파", 1000);
        Assertions.assertEquals(food.getName(), "양파");
        Assertions.assertEquals(food.getPrice(), 1000);
    }

}