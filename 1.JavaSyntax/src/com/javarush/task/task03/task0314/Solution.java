package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        {
            for (int i = 1; i <= 10; i++) { // строка от 1 до 10 множители 1
                for (int y = 1; y <= 10; y++) { // множители 2
                    System.out.print(i * y + " ");
                }
                System.out.println(" "); // перенос строки
            }
        }
    }
}
