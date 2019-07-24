package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(convertEurToUsd(12, 37.15));
        System.out.println(convertEurToUsd(14, 82.66));
    }


    public static double convertEurToUsd(int eur, double course) {
        double dol;
        dol = eur * course;
        return dol;

    }
}
