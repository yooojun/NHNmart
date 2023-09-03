package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("FoodStandsAddTest")
    void foodStrandsAddTest(){
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        Assertions.assertEquals("양파",foodStand.getFoods().get(0).getName());
        Assertions.assertEquals(1000,foodStand.getFoods().get(0).getPrice());

    }
    @Test
    @DisplayName("FoodStandsDeleteTest")
    void foodStandsDeleteTest(){
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();
        Food food = new Food("양파",1000);
        Assertions.assertEquals(food.getName() ,nhnMart.getFoodStand().del("양파",1).getName());
    }
}