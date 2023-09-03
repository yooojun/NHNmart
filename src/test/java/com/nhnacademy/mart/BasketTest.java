package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("BasketConstructTest")
    void basketConstructTest(){
        Food food = new Food("파", 500);
        Basket basket = new Basket();
        basket.add(food);
        Assertions.assertEquals(basket.getFoods().get(0), food);
    }

}