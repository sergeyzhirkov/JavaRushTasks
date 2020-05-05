package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int summa = 0;
        while (!s.equals("сумма")){
            summa+=Integer.parseInt(s);
            s = sc.nextLine();
        }
        System.out.println(summa);
        //напишите тут ваш код
    }
}
