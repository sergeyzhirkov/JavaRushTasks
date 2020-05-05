package com.javarush.task.task05.task0532;



import java.io.*;

import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maximum = sc.nextInt();
        int a;
        for (int i = 01; i <n ; i++) {
            a = sc.nextInt();
            if (a>maximum) maximum = a;

        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
