package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat catg = new Cat();
        Cat catb = new Cat();
        Dog dogy = new Dog();
        Dog dogg = new Dog();


        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(catb);
        System.out.println(catg);
        System.out.println(dogg);
        System.out.println(dogy);
        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }


    //напишите тут ваш код

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        @Override
        public String toString() {
            return "Dog";
        }
    }
}
