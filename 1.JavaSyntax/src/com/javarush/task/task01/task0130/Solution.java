package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(32));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
     double fahrenheit = 9/5.0 * celsius + 32;

        return fahrenheit;
    }
}