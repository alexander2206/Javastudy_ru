package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {

    public static int min(int a, int b, int c, int d) {
        int min;
        int z = min(a, b);
        int f;
        if (c < z)
            f = c;
        else
            f = z;
        if (f < d)
            min = f;
        else
            min = d;
        return min;
    }


    public static int min(int a, int b) {
        int min1;
        if (a < b)
            min1 = a;
        else
            min1 = b;
        return min1;

    }


    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}