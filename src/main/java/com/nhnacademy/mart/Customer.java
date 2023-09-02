package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;
    private int money;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.money = 20000;
    }

    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현

    public void pickFoods(FoodStand foodStand) {
        for (int h = 0; h < buyList.getItems().size(); h++) {
            for (int j = 0; j < foodStand.getFoods().size(); j++) {
                if (foodStand.getFoods().get(j).getName().equals(buyList.getItems().get(h).getName())) {
                    for (int i = 0; i < buyList.getItems().get(h).getAmount(); i++) {
                        basket.add(foodStand.del(buyList.getItems().get(h).getName(), j));
                    }
                    break;
                }
            }
        }


    }

    public void payTox(Counter counter) {

        int totalPraice = counter.pay(basket);

        this.money -= totalPraice;
        System.out.println(totalPraice);
        System.out.println(money);

    }


    // TODO payTox 메서드 구현


}
