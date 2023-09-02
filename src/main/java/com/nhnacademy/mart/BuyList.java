package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(StringTokenizer stringTokenizer) {


        while (stringTokenizer.hasMoreTokens()){
            String name = stringTokenizer.nextToken();
            int amount = Integer.valueOf(stringTokenizer.nextToken());
            if (name.equals("양파") || name.equals("계란") ||name.equals("파") || name.equals("사과")){
                Item item = new Item(name, amount);
                items.add(item);
            }
            else {
                throw new IllegalArgumentException("존재하지 않는 상품입니다.");
            }

        }

    }

    public ArrayList<Item> getItems() {
        return items;
    }
//    public Food getfood(ArrayList<Food> foods) {
//        foods.get()
//        foods.contains("asd");
//    }


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
