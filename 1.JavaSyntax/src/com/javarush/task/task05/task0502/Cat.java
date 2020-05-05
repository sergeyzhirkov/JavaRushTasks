package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int k = 0;
        if (this.age>anotherCat.age) k++; else if (this.age<anotherCat.age) k--;
        if (this.weight>anotherCat.weight) k++; else if (this.weight<anotherCat.weight) k--;
        if (this.strength>anotherCat.strength) k++; else if (this.strength<anotherCat.strength) k--;
        return k>0;//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
