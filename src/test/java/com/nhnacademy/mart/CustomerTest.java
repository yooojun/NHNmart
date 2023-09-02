package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("Precondition")
    public void customerPrecondition(){
        //given
        BuyList buyList = new BuyList();
        Customer customer = new Customer(buyList);
        //when

        //then
    }
}