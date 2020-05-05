package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date datta = new Date(date);
        Date datta2 = new Date("JAN 1 "+(1900+datta.getYear()));
        long k = ((datta.getTime()-datta2.getTime())/(1000*60*60*24));
        //System.out.println(datta2);
        return k%2==0;
    }
}
