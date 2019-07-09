package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Cat nafana = new Cat();
        Dog vylf = new Dog();
        Fish kit = new Fish();
        Woman marry = new Woman();
        nafana.owner = marry;
        vylf.owner = marry;
        kit.owner = marry;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;

    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
