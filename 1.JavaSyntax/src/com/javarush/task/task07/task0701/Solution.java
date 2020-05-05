package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[20];
        for (int i = 0; i < 20; i++) {
            array1[i] = sc.nextInt();
        }// создай и заполни массив
        return array1;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        // найди максимальное значение
        return array[array.length -1];
    }
}
