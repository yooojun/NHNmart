package com.nhnacademy.mart;

import java.util.StringTokenizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    @DisplayName("pickFoods Test")
    void pickFoodsTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        foodStand.add(new Food("양파", 1000));
        foodStand.add(new Food("파", 1000));
        BuyList buyList = new BuyList();
        buyList.add(new StringTokenizer("양파 3"));
        Customer customer = new Customer(buyList);
        Basket basket = new Basket();
        customer.bring(basket);
        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(foodStand));
    }

    @Test
    @DisplayName("payTox Test")
    void payToxTest() {
        Counter counter = new Counter();
        BuyList buyList = new BuyList();
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();
        buyList.add(new StringTokenizer("계란 5"));
        Customer customer = new Customer(buyList);
        customer.bring(nhnMart.provideBasket());
        customer.pickFoods(nhnMart.getFoodStand());
        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.payTox(counter));
    }


}