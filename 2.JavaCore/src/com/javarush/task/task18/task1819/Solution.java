package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        String fileName2 = sc.nextLine();
        FileInputStream fis1 = new FileInputStream(fileName1);
        byte[] array1 = new byte[fis1.available()];
        fis1.read(array1);
        fis1.close();
        FileOutputStream fos1 = new FileOutputStream(fileName1);
        FileInputStream fis2 = new FileInputStream(fileName2);
        byte[] array2 =  new byte[fis2.available()];
        fis2.read(array2);
        fis2.close();
        fos1.write(array2);
        fos1.write(array1);
        fos1.close();

    }
}
