package com.nhnacademy.mart;

import static com.nhnacademy.mart.NhnMartShell.logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {

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
        ArrayList<BuyList.Item> items = buyList.getItems();
        ArrayList<Food> foods = foodStand.getFoods();

        for (int h = 0; h < items.size(); h++) {
            for (int j = 0; j < foods.size(); j++) {
                if (foods.get(j).getName().equals(items.get(h).getName())) {
                    for (int i = 0; i < items.get(h).getAmount(); i++) {
                        basket.add(foodStand.del(items.get(h).getName(), j));
                    }
                    break;
                }
            }
        }


    }
    // TODO payTox 메서드 구현

    public void payTox(Counter counter) {

        int totalPraice = counter.pay(basket);

        this.money -= totalPraice;
        if (money < 0) {
            logger.warn("잔액이 부족합니다");
            throw new IllegalArgumentException("돈이 부족합니다");
        }
        logger.info("고객님 결제 후 잔액 : {}",money);
        System.out.println("고객님 결제 후 잔액 : " + money);

    }




}
