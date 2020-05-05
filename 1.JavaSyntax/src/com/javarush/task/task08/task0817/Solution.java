package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String ,String > map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(""+i,""+i+i);
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String ,String > copy = new HashMap<>();
        for (String key : copy.keySet()
             ) { int p = 0;
            for (String key2: copy.keySet()
                 ) {
                if (copy.get(key).equals(copy.get(key2))) p++;
            }
            if (p>1) removeItemFromMapByValue(map,copy.get(key));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
