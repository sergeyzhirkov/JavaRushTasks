package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
Scanner sc = new Scanner(System.in);
int s1=0,s2=0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (a>0) s2++;
            if (a<0) s1++;
        }
        System.out.println("количество отрицательных чисел: "+s1);
        System.out.println("количество положительных чисел: "+s2);
    }
}
