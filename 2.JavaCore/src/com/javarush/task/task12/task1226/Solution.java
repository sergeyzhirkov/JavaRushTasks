package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {
    interface CanFly {
        void fly();
    }
    interface CanClimb {
        void climb();
    }
    interface CanRun {
        void run();
    }

    public static void main(String[] args) {

    }

    public abstract class Cat implements CanRun, CanClimb{
    }

    public abstract class Dog implements CanRun{
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements CanRun, CanFly{
    }
}
