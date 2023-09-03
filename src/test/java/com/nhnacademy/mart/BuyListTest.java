package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("BuyListAddTest")
    void buyListAddTest(){
        //given
        BuyList buyList = new BuyList();
        StringTokenizer stringTokenizer = new StringTokenizer("마늘 2");
        Assertions.assertThrows(IllegalArgumentException.class, () -> buyList.add(stringTokenizer));
    }
    @Test
    @DisplayName("ItemNameTest")
    void itemNameTest(){
        BuyList.Item item = new BuyList.Item("양파", 2);
        Assertions.assertEquals("양파", item.getName());
    }
    @Test
    @DisplayName("ItemAccountTest")
    void itemAccountTest(){
        BuyList.Item item = new BuyList.Item("양파", 2);
        Assertions.assertEquals(2, item.getAmount());
    }

}