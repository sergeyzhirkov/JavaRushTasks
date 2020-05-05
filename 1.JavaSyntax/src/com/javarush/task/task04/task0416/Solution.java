package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double t = Double.parseDouble(sc.nextLine());
        t = t-5*((int)(t)/5)+0.0000001;
        if (t<3) System.out.println("зелёный");
        else if (t<4) System.out.println("жёлтый");
        else System.out.println("красный");


        //напишите тут ваш код

    }
}