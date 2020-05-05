package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrs = new ArrayList<String >();
        for (int i = 0; i < 5; i++) {
            arrs.add(sc.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = arrs.get(arrs.size()-1);
            arrs.remove(arrs.size()-1);
            arrs.add(0,s);
        }
        arrs.forEach(elem -> System.out.println(elem));
        //напишите тут ваш код
    }
}
