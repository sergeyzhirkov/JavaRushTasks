package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            Map<String, Double> map = new HashMap<>();
            while (reader.ready()) {
                String string = reader.readLine();
                if (!map.containsKey(parseString(string)[0])) {
                    map.put(parseString(string)[0], Double.parseDouble(parseString(string)[1]));
                } else {
                    map.put(parseString(string)[0], map.get(parseString(string)[0])+Double.parseDouble(parseString(string)[1]));
                }
            }
            Object[] arrayOfStrings =
            map.keySet().toArray();
            Arrays.sort(arrayOfStrings);
            for (Object s:arrayOfStrings
                 ) {
                System.out.println((String) s+ " "+ map.get((String) s));
            }
        }
    }

    public static String[] parseString(String s){
        return s.split(" ");
    }
}
