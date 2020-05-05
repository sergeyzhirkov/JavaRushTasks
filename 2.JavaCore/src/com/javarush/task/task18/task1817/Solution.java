package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int kolProb = 0, all =0;
        while (fis.available()>0){
            if (((char)fis.read())==' '){
                kolProb++;
            }
            all++;
        }
        System.out.printf("%.2f",(double)kolProb/all*100);
        fis.close();
    }
}
