package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private
    String name;private int weight = 6; private int age = 8;
    private String address; private String color ="sdfsd";
    public void initialize(String name){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    public void initialize(String name, int ves, int age){
        this.name = name;
        this.weight = ves;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    public void initialize(String name,  int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    public void initialize( int ves,  String color){
        this.name = name;
        this.weight = ves;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    public void initialize(int ves, String color, String address){
        this.name = name;
        this.weight = ves;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
