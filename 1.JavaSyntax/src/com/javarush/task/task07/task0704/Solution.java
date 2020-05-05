package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.println(ar[i]);
        }
        //напишите тут ваш код
    }
}

