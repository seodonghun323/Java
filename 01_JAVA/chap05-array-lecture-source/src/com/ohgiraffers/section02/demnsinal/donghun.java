package com.ohgiraffers.section02.demnsinal;

public class donghun {
    public static void main(String[] args) {

        String[][] adad = new String[10][15];
        String[] eng = {"A","B","C,","D","E","F","G","H","I","J"};
        for (int e = 0; e < adad.length; e++) { //세로
            for (int j = 0; j < adad.length; j++) { //세로
                adad[e][j] = eng[e];


            }
        }

    }
}
