package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(0.0,"");
        labels.put(1.2,"");
        labels.put(1.3,"");
        labels.put(2.3,"3");
        labels.put(3.4,"");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
