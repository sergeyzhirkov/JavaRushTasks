package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[5];
        for (int i = 0; i <5 ; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mass);
        for (int i = 0; i <5 ; i++) {
            System.out.println(mass[i]);
        }
        //напишите тут ваш код
    }
}
