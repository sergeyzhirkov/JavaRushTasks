package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    private String name;
    private int age;
    private char sex;
    public void initialize(String name, int age , char sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void initialize(String name){

        this.name = name;

    }
    public void initialize(String name, int age){
        this.age = age;
        this.name = name;

    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
