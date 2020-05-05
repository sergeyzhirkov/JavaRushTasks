package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrS = new ArrayList<String >();
        Collections.addAll(arrS, "мама", "мыла", "раму");
        arrS.add(1, "именно");
        arrS.add(3, "именно");
        arrS.add(5,  "именно");
        for (String x : arrS){
            System.out.println(x);
        }
        //напишите тут ваш код
    }
}
