package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testContinue(){
    /*
    continue문 사용에 대한 흐름 이해
    continue문은 반복문 내에서 사용
    해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘아가게 해ㅅ줌
    일반적으로 if(조건식){continue}; 처럼 사용됨
    보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자할때 사용
     */

        // 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력

        for(int dan = 2; dan < 10; dan++){

            /* 설명. 여기까지 빠져나옴 */
            for(int su = 1; su < 10; su++){
                if(su % 2 == 0){

                    /*  su가 짝수인 경우 해당 회차 반복 내용을 건너 뛰고 증감식으로 이동 */
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }



    }
}
