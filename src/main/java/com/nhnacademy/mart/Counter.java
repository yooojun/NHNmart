package com.nhnacademy.mart;


import static com.nhnacademy.mart.NhnMartShell.logger;

/**
 * Counter 클래스.
 * Basket을 받아 가격을 반환함.
 */
public class Counter {
    /**
     * 카운터에서 계산을 한다.
     *<p>
     *     계산을 해준다.
     *</p>
     *
     * @param basket pay
     *               1. basket을 입력받아 pay를 반환.
     *
     * @return price
     */
    public int pay(Basket basket) {
        int price = 0;
        for (int i = 0; i < basket.getFoods().size(); i++) {
            price += basket.getFoods().get(i).getPrice();
        }
        logger.info("총 가격은 {}원 입니다", price);
        System.out.println("총 가격은 " + price + "원 입니다.");
        return price;

    }

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

}
