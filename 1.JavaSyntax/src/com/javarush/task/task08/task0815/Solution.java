package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String ,String > slov = new HashMap<String ,String>();
        for (int i = 0; i < 10; i++) {
            slov.put(""+i,""+i+i);
        }
        return slov;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int s = 0;
        for (String st:map.values()
             ) {if (name.equals(st)) s++;

        }
            return s;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int s = 0;
        for (String st: map.keySet()
             ) {if (lastName.equals(st)) s++;

        }
        return s;
    }

    public static void main(String[] args) {

    }
}
