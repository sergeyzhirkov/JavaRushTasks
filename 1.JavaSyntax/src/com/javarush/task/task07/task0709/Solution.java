package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<String > s = new ArrayList<String>();
        int sLength = 100000;
        for (int i = 0; i <5 ; i++) {
            s.add(sc.nextLine());
            if (s.get(i).length()<sLength) sLength = s.get(i).length();

        }
        for (int i = 0; i < 5; i++) {

            if (s.get(i).length() == sLength) System.out.println(s.get(i));
        }
    }
}
