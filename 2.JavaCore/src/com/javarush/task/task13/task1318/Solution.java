package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
         FileInputStream fis = new FileInputStream(s);
         while (fis.available()>0) {
             System.out.print((char) fis.read());
         }
         br.close();
         fis.close();


    }
}