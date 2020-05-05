package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String ,Integer> mapa = new HashMap<>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("")) break;
            int id = Integer.parseInt(s);
            String name = reader.readLine();
            mapa.put(name,id);
        }
        for (String s:mapa.keySet()
             ) {
            System.out.println(mapa.get(s)+" "+s);

        }
        //System.out.println("Id=" + id + " Name=" + name);
    }
}
