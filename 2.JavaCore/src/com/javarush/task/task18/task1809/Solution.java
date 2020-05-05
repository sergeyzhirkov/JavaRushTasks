package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        FileOutputStream fout = new FileOutputStream(sc.nextLine());
        byte[] mass = new byte[fin.available()];
        fin.read(mass);
        for (int i = mass.length-1; i >=0 ; i--) {
            fout.write(mass[i]);
        }
        fin.close();
        fout.close();
    }
}
