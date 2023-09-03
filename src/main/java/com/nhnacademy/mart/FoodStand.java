package com.nhnacademy.mart;

import static com.nhnacademy.mart.NhnMartShell.logger;

import java.util.ArrayList;

/**
 * 푸드 객체를 받아 진열하는 클래스.
 */
public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현


    /**
     * 푸드를 FoodStrand에서 빼서 basket에 추가하는 메서드.
     *
     * @param buyList 구매할 품목명
     * @param i       구매할 항목 인덱스
     * @return barket에 담을 food
     */
    public Food del(String buyList, int i) {
        if (!buyList.equals(foods.get(i).getName())) {
            logger.warn("재고가 부족합니다");
            throw new IllegalArgumentException("재고가 부족합니다");
        }
        Food food = foods.get(i);
        foods.remove(i);
        return food;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
