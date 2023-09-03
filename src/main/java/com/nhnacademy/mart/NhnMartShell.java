package com.nhnacademy.mart;

import java.util.Scanner;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1. NhnMartShell
 * 2. main
 * 3. input buylist
 */
public class NhnMartShell {

    /**
     * 1. main methode 동작
     */
    public static final Logger logger = LoggerFactory.getLogger(NhnMartShell.class);

    /**
     * mart main class.
     *
     * <p>
     *     마트 메인 클래스.
     * </p>
     *
     * @param args main
     *             Customer 생성.
     *             bring 실행 장바구니 챙기기.
     *             pickfood 물건을 집는다.
     *             payTox 계산한다.
     */
    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer yongjun = new Customer(buyList);

        // 장바구니를 챙긴다.
        yongjun.bring(mart.provideBasket());

        // 식품을 담는다.
        yongjun.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        try {
            yongjun.payTox(mart.getCounter());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private static BuyList inputBuyListFromShell() {
        logger.debug("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");

        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner scanner = new Scanner(System.in);

        BuyList buyList = new BuyList();
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());

        buyList.add(stringTokenizer);

        return buyList;
    }
}
