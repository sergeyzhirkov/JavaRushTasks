package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            Map<String , Double> mapa = new HashMap<>();
            while (reader.ready()){
                String s = reader.readLine();
                String arg1 = s.split(" ")[0];
                Double arg2 = Double.parseDouble(s.split(" ")[1]);
                if (!mapa.containsKey(arg1)){
                    mapa.put(arg1,arg2);
                } else {
                    mapa.put(arg1, mapa.get(arg1) + arg2);
                }
            }
           // ArrayList<Double> arrayDouble =

                   Object[] arrayOfObject = mapa.values().toArray();
            Double[] arrayDouble = new Double[arrayOfObject.length];
            for (int i = 0; i < arrayOfObject.length; i++) {
                arrayDouble[i] = (Double) arrayOfObject[i];
            }
            Arrays.sort(arrayDouble);
            for (String s: mapa.keySet()
                 ) {
                if (Math.abs(mapa.get(s)-arrayDouble[arrayDouble.length-1])<0.0001){
                    System.out.println(s);
                }
            }
        }
    }
}
