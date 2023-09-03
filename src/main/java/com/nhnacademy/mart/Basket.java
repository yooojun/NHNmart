package com.nhnacademy.mart;

import java.util.ArrayList;

/**
 * Basket 클래스.
 * 장바구니 역할
 */
public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
