package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i =0 , s = 0;
        while (i!=-1) {
            i = sc.nextInt();
            s+=i;
        }
        System.out.println(s);
    }
}
