package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int t;
        if (c>b) {
            t=b; b=c; c=t;
        }
        if (b>a) {
            t=a;a=b;b=t;
        }
        if (b<c) {
            t=c; c=b; b=t;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
