package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = " "+ reader.readLine();
        char[] ch = string.toCharArray();
        for (int i = 1; i <ch.length ; i++) {
            if (ch[i-1]==' ' && ch[i]>='а' && ch[i]<='я') ch[i]+=-'а'+'А';
            if (ch[i-1]==' ' && ch[i]>='a' && ch[i]<='z') ch[i]+=-'a'+'A';
        }
        for (int i = 1; i <ch.length ; i++) {
            System.out.print(ch[i]);
        }
        //напишите тут ваш код
    }
}
