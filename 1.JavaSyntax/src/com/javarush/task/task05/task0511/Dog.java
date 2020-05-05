package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name, color;
    private int height;//напишите тут ваш код

    public void initialize(String name){
        this.name=name;
    }

    public void initialize(String imy, int rost){
        name = imy;
        height = rost;
    }

    public void initialize(String name, int rost, String color){
        this.name = name;
        height = rost;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
