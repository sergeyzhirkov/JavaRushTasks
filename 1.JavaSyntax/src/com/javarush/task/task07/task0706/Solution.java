package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[15];
        int s1=0,s2=0;
        for (int i = 0; i < 15; i++) {
            ar[i] = sc.nextInt();
            if (i %2==0) s1+=ar[i]; else s2+=ar[i];
        }
        if (s1>s2) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");//напишите тут ваш код
    }
}
