package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
            int i = sc.nextInt();
            if (i>=1 && i<1000) {
                if (i%2==0) System.out.println("четное "); else System.out.println("нечетное ");
                if (i/10==0) System.out.println("однозначное число"); else
                    if (i/100==0) System.out.println("двузначное число"); else System.out.println("трехзначное число");
            }
    }
}
