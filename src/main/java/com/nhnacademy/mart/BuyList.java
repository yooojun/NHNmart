package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(Scanner scanner) {
        while (scanner.nextLine().equals("\n")){
            String name = scanner.next();
            int amount = scanner.nextInt();

            Item item = new Item(name, amount);
            items.add(item);
        }

    }

    public Food getfood(ArrayList<Food> foods) {
        foods.get()
        foods.contains("asd");
    }


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
    }
}
