package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos1 = new FileOutputStream(sc.nextLine(),true);
        FileInputStream fis2 = new FileInputStream(sc.nextLine());
        FileInputStream fis3 = new FileInputStream(sc.nextLine());
        while (fis2.available()>0){
            fos1.write(fis2.read());
        }
        while (fis3.available()>0){
            fos1.write(fis3.read());
        }
        fis2.close();
        fis3.close();
        fos1.close();
    }
}
