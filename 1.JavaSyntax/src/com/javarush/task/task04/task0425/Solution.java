package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a>0 && b>0) System.out.println(1);
        if (a>0 && b<0) System.out.println(4);
        if (a<0 && b>0) System.out.println(2);
        if (a<0 && b<0) System.out.println(3);
    }
}
