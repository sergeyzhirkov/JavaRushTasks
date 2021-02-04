package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.split(" ").length < 5) throw new TooShortStringException();
        String[] st = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            stringBuilder.append(st[i] + " ");
        }
        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
