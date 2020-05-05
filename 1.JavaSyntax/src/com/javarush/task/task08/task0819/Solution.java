package com.javarush.task.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> mnozhKot = new HashSet<>();
        Collections.addAll(mnozhKot,new Cat(),new Cat(), new Cat());
        return mnozhKot;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat s:cats
             ) {
            System.out.println(s);

        }
    }
    public static class Cat{

    }
    // step 1 - пункт 1
}
