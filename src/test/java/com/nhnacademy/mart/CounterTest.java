package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest
{
    @Test
    @DisplayName("CounterPayTest")
    void counterPayTest(){
        Counter counter = new Counter();
        Basket basket = new Basket();
        basket.add(new Food("양파",1000));
        basket.add(new Food("양파",2000));
        basket.add(new Food("양파",3000));
        basket.add(new Food("양파",4000));
        basket.add(new Food("양파",5000));
        Assertions.assertEquals(15000,counter.pay(basket));



    }

}