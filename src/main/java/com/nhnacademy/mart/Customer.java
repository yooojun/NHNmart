package com.nhnacademy.mart;

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
        System.out.println("hihi");
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현

    public void pickFoods(FoodStand foodStand) {
        int amount = 0;
        for (int i = 0; i < buyList.getItems().size(); i++) {
            amount += buyList.getItems().get(i).getAmount();
        }
        for (int j = 0; j < foodStand.getFoods().size(); j++) {
            for (int i = 0; i < amount; i++) {
                if (foodStand.getFoods().get(j).getName().equals(buyList.getItems().get(i).getName())) {
                    basket.add(foodStand.del(buyList.getItems().get(i).getName(), j));
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
