package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.StringTokenizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    @DisplayName("잔액 부족 Test")
    void payToxTest(){
        Counter counter = new Counter();
        BuyList buyList = new BuyList();

        Customer customer = new Customer(buyList);
        customer.payTox(counter);
    }

//    @Test
//    @DisplayName("Precondition")
//    public void customerPrecondition(){
//        //given
//        BuyList buyList = new BuyList();
//        Customer customer = new Customer(buyList);
//        //when
//
//        //then
//    }

//    @Test
//    @DisplayName("pickFoodsTest")
//    void pickFoodsTest(){
//        NhnMart nhnMart = new NhnMart();
//        nhnMart.prepareMart();
//        BuyList buyList = new BuyList();
//
//        StringTokenizer str = new StringTokenizer("양파 2 계란 1 파 1 사과 1") ;
//        buyList.add(str);
//        Assertions.assertThrows(IllegalArgumentException.class, () -> nhnMart.getFoodStand().del("양파",4));
//
//    }
}