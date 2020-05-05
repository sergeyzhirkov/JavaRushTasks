package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    List<Integer> mas = new ArrayList<Integer>();
    int max = 0, mm = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            mas.add(sc.nextInt());
            if (i>0) {
                if (mm>max) max = mm;
                if (mas.get(i).equals(mas.get(i-1))) mm++; else mm=0;

            }
        }
        if (mm>max) max = mm;
        System.out.println(max+1);
    }
}