package com.ohgiraffers.section02.demnsinal;

public class dlQmsdlehdgnsdl {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        int[][] arar = {arr1, arr2};
        for (int i = 0; i < arar.length; i++) {
            for (int j = 0; j < arar[i].length; j++) {
                System.out.print(arar[i][j] + " ");




            }
            System.out.println();
        }

        System.out.println(arar[1][2]);
        System.out.println(arar[0][3]);

    }
}
