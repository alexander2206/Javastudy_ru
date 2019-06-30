package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Оля";
        person.age = 20;
        person.weight = 30;
        person.money = 6000;
    }

    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }
}
