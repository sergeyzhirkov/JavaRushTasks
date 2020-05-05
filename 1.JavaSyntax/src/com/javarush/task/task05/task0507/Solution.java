package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k,s=0,n=0;
        do {
            k = sc.nextInt();
            if (k!=-1) {
                s+=k;
                n++;
            }
        } while (k!=-1);
        System.out.println((double)s/n);
        //напишите тут ваш код
    }
}

