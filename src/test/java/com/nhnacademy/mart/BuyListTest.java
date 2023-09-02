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

}