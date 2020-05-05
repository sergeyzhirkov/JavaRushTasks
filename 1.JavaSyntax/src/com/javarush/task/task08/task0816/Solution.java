package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        //DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        //map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        for (int i = 0; i <10 ; i++) {
            map.put(""+i,new Date());
        }
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String ,Date> mappadel = new HashMap<String, Date>(map);
        for (String key : mappadel.keySet()
             ) {if (mappadel.get(key).getMonth()>=5 && mappadel.get(key).getMonth()<=7) map.remove(key);

        }



    }

    public static void main(String[] args) {

    }
}
