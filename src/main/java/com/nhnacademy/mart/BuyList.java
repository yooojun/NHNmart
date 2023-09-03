package com.nhnacademy.mart;


import static com.nhnacademy.mart.NhnMartShell.logger;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 구매목록 클래스.
 * 사용자로부터 입력받음.
 */
public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성

    /**
     * 구매목록에 항목을 추가하는 메서드.
     *
     * @param stringTokenizer add
     *                        stringTokenizer를 입력.
     *                        구매하고자 하는 항목이 매대에 존재하는지 여부확인 후.
     *                        존재하면 상품 추가.
     *                        존재하지 않으면 throw 발생.
     *
     */
    public void add(StringTokenizer stringTokenizer) {


        while (stringTokenizer.hasMoreTokens()) {
            String name = stringTokenizer.nextToken();
            int amount = Integer.valueOf(stringTokenizer.nextToken());
            if (name.equals("양파") || name.equals("계란") || name.equals("파") || name.equals("사과")) {
                Item item = new Item(name, amount);
                items.add(item);
            } else {
                logger.warn("상품이 존재하지 않습니다.");
                throw new IllegalArgumentException("존재하지 않는 상품입니다.");
            }

        }

    }

    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * buylist 항목을 item 객체로 추가.
     */
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
