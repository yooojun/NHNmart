package com.nhnacademy.mart;

public class Counter {
    public int pay(Basket basket) {
        int price = 0;
        for (int i = 0; i < basket.getFoods().size(); i++) {
            price +=basket.getFoods().get(i).getPrice();
        }
        return price;

    }

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

}
