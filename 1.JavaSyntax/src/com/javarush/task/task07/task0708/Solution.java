package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         strings = new ArrayList<String>();
        int sLength = 0;
        for (int i = 0; i <5 ; i++) {
            strings.add(sc.nextLine());
            if (strings.get(i).length()>sLength) sLength = strings.get(i).length();

        }
        for (int i = 0; i < 5; i++) {

            if (strings.get(i).length() == sLength) System.out.println(strings.get(i));
        }//напишите тут ваш код
    }
}
