package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        switch (month) {
            case 1: case 2: case 12: System.out.println("зима"); break;
            case 3: case 4: case 5:  System.out.println("весна"); break;
            case 7: case 8: case 6:  System.out.println("лето"); break;
            default:
                System.out.println("осень"); break;
            //напишите тут ваш код
        }

    }
}