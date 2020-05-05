package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a>=b && a<=c || a>=c && a<=b) System.out.println(a);
        else if (b>=a && b<=c || b<=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }
}
