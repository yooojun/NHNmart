package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현


    public Food del(String buyList, int i) {
        if (buyList.equals(foods.get(i).getName()))
            throw new IllegalArgumentException("재고가 부족합니다");
        Food food = foods.get(i);
        foods.remove(i);
        return food;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
