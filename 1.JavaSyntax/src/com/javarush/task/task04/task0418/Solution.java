package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(Math.min(a,b));
    }
}