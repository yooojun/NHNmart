package com.nhnacademy.mart;


import static com.nhnacademy.mart.NhnMartShell.logger;

public class Counter {
    public int pay(Basket basket) {
        int price = 0;
        for (int i = 0; i < basket.getFoods().size(); i++) {
            price +=basket.getFoods().get(i).getPrice();
        }
        logger.info("총 가격은 {}원 입니다", price);
        System.out.println("총 가격은 "+price+"원 입니다.");
        return price;

    }

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

}
