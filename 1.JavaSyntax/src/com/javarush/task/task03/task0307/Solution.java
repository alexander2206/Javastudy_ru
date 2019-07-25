package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg Vaska = new Zerg();
        Zerg Olya = new Zerg();
        Zerg Sasha = new Zerg();
        Zerg Anya = new Zerg();
        Zerg Kostya = new Zerg();
        Protoss Lena = new Protoss();
        Protoss Natasha = new Protoss();
        Protoss Katya = new Protoss();
        Terran Vylf = new Terran();
        Terran Marik = new Terran();
        Terran Kyzya = new Terran();
        Terran Marusya = new Terran();
        Vaska.name = "Vaska";
        Olya.name = "Olya";
        Sasha.name = "Sasha";
        Anya.name = "Anya";
        Kostya.name = "Kostya";
        Lena.name = "Lena";
        Natasha.name = "Natasha";
        Katya.name = "Katya";
        Vylf.name = "Vylf";
        Marik.name = "Marik";
        Kyzya.name = "Kyzya";
        Marusya.name = "Marusya";


    }


    public static class Zerg {

        public String name;
    }

    public static class Protoss {

        public String name;
    }

    public static class Terran {

        public String name;
    }
}
