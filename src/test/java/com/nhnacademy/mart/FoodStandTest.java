package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {
    @Test
    @DisplayName("FoodDeleteTest")
    void foodDeleteTest(){
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();
        Food food = new Food("양파",1000);

        Assertions.assertEquals(food.getName() ,nhnMart.getFoodStand().del("양파",1).getName());
//        Assertions.assertThrows(IllegalArgumentException.class, () -> nhnMart.getFoodStand().del("양파",4));

    }
}