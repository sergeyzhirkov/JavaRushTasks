package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mas);
        int maximum=mas[19];
        int minimum=mas[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
