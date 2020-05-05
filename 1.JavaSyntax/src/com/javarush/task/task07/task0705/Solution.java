package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[20];
        for (int i = 0; i < 20 ; i++) {
            ar[i] = sc.nextInt();
        }
        int [] ar1 = new int[10];
        int[] ar2 = new int[10];
        ar1 = Arrays.copyOf(ar,10);
         ar2 = Arrays.copyOfRange(ar,10,20);
        for (int i = 0; i < 10; i++) {
            System.out.println(ar2[i]);
        }
        //напишите тут ваш код
    }
}
