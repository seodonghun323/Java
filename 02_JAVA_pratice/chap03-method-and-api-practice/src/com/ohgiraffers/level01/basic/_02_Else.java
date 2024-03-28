package com.ohgiraffers.level01.basic;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 13;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1")
            ;
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }

        System.out.println("커피주문 완료 #1");

        hour = 10;
        boolean morningCoffe = false;
        if (hour >= 14 || morningCoffe == true) {
            System.out.println("아이스 아메리카노 (디카페인)+1");

        } else {
            System.out.println("아이스 아메리카노+1");
        }
        System.out.println("커피 주문 완료 #2");

    }
}