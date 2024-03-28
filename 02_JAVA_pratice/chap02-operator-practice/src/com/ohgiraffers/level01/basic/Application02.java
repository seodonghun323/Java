package com.ohgiraffers.level01.basic;

public class Application02 {

    public static void main(String[] args) {

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1: 0);

        // numOfApples / sizeOfBucket = 몫 : 9
        // numOfApples % sizeOfBucket = 나머지 2
        // 나머지가 0보다 클 경우 1을 반환
        // 나머지가 0일 경우 0을 반환

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

    }

}