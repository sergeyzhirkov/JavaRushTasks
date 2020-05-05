package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("sdfds",13);//напишите тут ваш код
    }

    static class Person {
        private String name;
        private int age;
        public void initialize(String namme, int agge){
            name = namme;
            age = agge;
        }//напишите тут ваш код
    }
}
