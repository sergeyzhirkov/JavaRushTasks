package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a<b+c && b<a+c && c<a+b) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");//напишите тут ваш код

    }
}