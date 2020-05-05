package com.javarush.task.task08.task0814;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            if (it.next()>10) it.remove();
        }
        //System.out.println(set);
    return set;
    }

    public static void main(String[] args) {

    }
}
