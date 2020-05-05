package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int s=0;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (a>0) s++;
        }
        System.out.println(s);
    }
}
