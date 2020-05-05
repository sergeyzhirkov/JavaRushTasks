package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String >();
        str.add(sc.nextLine());
        for (int i = 1; i < 10; i++) {
            str.add(sc.nextLine());
            if (str.get(i).length()<str.get(i-1).length()) {
                System.out.println(i);
                break;}
        }

    }
}

