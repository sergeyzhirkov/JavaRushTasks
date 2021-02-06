package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        if (params == null) return null;
        StringBuilder result = new StringBuilder();
        for (String s : params.keySet()) {
            if (params.get(s) == null) {
                continue;
            }
            if (result.toString().length() != 0) {
                result.append(" and ");
            }
            result.append(s);
            result.append(" = '" +params.get(s) + "'");

        }
        return result.toString();
    }
}
