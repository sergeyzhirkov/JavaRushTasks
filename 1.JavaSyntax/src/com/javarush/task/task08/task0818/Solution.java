package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for (int i = 0; i < 10; i++) {
            map.put(""+i,i);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String ,Integer > mappaDel = new HashMap<String ,Integer>(map);
        for (String x:mappaDel.keySet()
             ) {if (mappaDel.get(x)<500) map.remove(x);

        }
    }

    public static void main(String[] args) {

    }
}