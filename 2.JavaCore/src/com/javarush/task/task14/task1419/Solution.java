package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.addAll(Arrays.asList(new ArrayIndexOutOfBoundsException(),new ClassCastException(),
                new ArrayStoreException(),  new IllegalArgumentException(), new IndexOutOfBoundsException(),
                new NegativeArraySizeException(), new StringIndexOutOfBoundsException(),
                new NullPointerException(), new NumberFormatException()));
        //напишите тут ваш код

    }
}
