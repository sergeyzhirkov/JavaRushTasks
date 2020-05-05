package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ascii = new int[256];

        FileInputStream fis = new FileInputStream(args[0]);
        while (fis.available()>0){
            ascii[fis.read()]++;
        }
        for (int i = 0; i < 255; i++) {
            if (ascii[i]!=0 ){
                System.out.println(((char)i)+" "+ascii[i]);
            }
        }
        fis.close();
    }
}
