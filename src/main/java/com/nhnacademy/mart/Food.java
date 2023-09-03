package com.nhnacademy.mart;

/**
 * 과일 객체를 생성하는 클래스.
 */
public class Food {

    private final String name;
    private final int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
