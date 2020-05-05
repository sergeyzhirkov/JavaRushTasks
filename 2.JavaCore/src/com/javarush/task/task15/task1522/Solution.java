package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else if (s.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else if (s.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else thePlanet = null;
        sc.close();
    }
}
