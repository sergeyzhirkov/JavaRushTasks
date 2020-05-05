package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
         String[] arrayS = new String[array.length];
        int[] arrayN = new int[array.length];
        int ints = 0, intn =0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                arrayN[intn++] = Integer.parseInt(array[i]);
            } else {
                arrayS[ints++] = array[i];
            }
        }
        for (int i = 0; i < ints; i++) {
            int t = i;
            for (int j = i+1; j < ints; j++) {
                if (isGreaterThan(arrayS[t],arrayS[j])) {
                    t = j;

                }
            }
            String s = arrayS[i];
            arrayS[i]=arrayS[t];
            arrayS[t]=s;
        }
        int k1 = arrayN.length, k2 = 0;
        Arrays.sort(arrayN);
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = ""+arrayN[--k1];
            } else {
                array[i] = arrayS[k2++];
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return (a.compareTo(b) > 0);
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
