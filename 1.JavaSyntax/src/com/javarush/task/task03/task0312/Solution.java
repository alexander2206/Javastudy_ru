package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код


    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(21));
        System.out.println(convertToSeconds(182));
    }


    public static int convertToSeconds(int hour) {
        int sec;
        sec = hour * 60 * 60;

        return sec;


    }
}
