package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a==b & a==c) System.out.println(a+" "+b+" "+c);
        else {
            if (a==b) System.out.println(a+" " +b);
            if (a==c) System.out.println(a+" "+c);
            if (b==c) System.out.println(b+" "+c);
        }
    }
}