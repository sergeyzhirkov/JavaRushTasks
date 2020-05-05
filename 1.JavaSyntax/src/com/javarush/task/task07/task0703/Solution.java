package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [] arrayOfString  = new String [10];
        int [] arrayOfInt = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayOfString[i] = sc.nextLine();
            //arrayOfInt[i] = arrayOfString[i].length();
            System.out.println(arrayOfInt[i] = arrayOfString[i].length());
        }
        //напишите тут ваш код
    }
}
