package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Set<String > ss = new HashSet<String >();
        Collections.addAll(ss, "арбуз",
                "банан",
                "вишня",
                "груша",
                "дыня",
                "ежевика",
                "женьшень",
                "земляника",
                "ирис",
                "картофель");
        for (String s:ss
             ) {
            System.out.println(s);

        }
    }
}
