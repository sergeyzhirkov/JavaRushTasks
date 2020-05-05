package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    private String name;
    private int height;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int heigth) {
        this.name = name;
        this.height = heigth;
    }

    public Dog(String name, int heigth, String color) {
        this.name = name;
        this.height = heigth;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
