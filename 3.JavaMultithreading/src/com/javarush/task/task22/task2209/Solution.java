package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/*
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) {
        Map<Character, HashSet<String>> map = new HashMap<>();
        for (char i = 'а'; i <= 'я'; i++) {
            map.put(i, new HashSet<>());
        }
        Character ch = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                String inputString = fileReader.readLine();
                if (inputString != null && inputString.length() > 0) {
                    String[] strings = inputString.split(" ");
                    for (String string : strings) {
                        ch = string.toLowerCase().charAt(0);
                        Set<String> set = map.get(ch);
                        set.add(string);

                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        for (char i = 'а'; i <= 'я'; i++) {
            if (map.get(i).isEmpty()) {
                map.remove(i);
            }
        }

        ArrayList<String> res = new ArrayList<>();
        while (!map.isEmpty()) {
//            Iterator<Character> iterator = map.keySet().iterator();
            Set<String> stringSet = map.get(ch);
            String first = stringSet.iterator().next();
            stringSet.remove(first);
            if (stringSet.isEmpty()) {
                map.remove(ch);
            }
            res.add(first);
            ch = first.toLowerCase().charAt(first.length() - 1);
//            while (iterator.hasNext()) {
//                Character character = iterator.next();
//
//            }
        }
        StringBuilder result = getLine(res.toArray(new String[res.size()]));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if ((words == null) || (words.length == 0)) {
            return new StringBuilder();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (stringBuilder.toString().length()!=0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(word);
        }
        return stringBuilder;
    }
}
