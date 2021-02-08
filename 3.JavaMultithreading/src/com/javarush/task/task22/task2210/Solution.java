package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("02 30023 3734", "23")));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[tokenizer.countTokens()];
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            array[count++] = tokenizer.nextToken();
        }
        return array;
    }
}
