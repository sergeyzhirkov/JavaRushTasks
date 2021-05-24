package com.javarush.task.task25.task2512;

import java.util.LinkedList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        getThMessage(e);
    }

    private void getThMessage(Throwable e) {
        if (e.getCause() != null) {
            getThMessage(e.getCause());
        }
        System.out.println(e.toString());
    }

    public static void main(String[] args) {
    }
}
