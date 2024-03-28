package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /* 접근제하낮에 대해 이해하고 필드에 접근하지 못하게 강제화할 수 있다.*/

        /* 1. private에 필드에 직접 접근하여 compile error를 발생 확인*/
        Monster monster1 = new Monster();
       /* monster1.kinds = "피카츄";
        monster1.hp = "200"; */
        /* monster1.kinds */

        monster1.setKinds("피카츄");
        monster1.setHp(200);

        System.out.println("monster1.getInfo() = " + monster1.getInfo());

    }
}
