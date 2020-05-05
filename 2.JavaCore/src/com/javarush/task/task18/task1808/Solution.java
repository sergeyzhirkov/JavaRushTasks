package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileInputStream fin1 = new FileInputStream(sc.nextLine());
        FileOutputStream fout2 = new FileOutputStream(sc.nextLine());
        FileOutputStream fout3 = new FileOutputStream(sc.nextLine());
        int k = fin1.available();
        byte[] mass = new byte[k/2+k%2];
        fin1.read(mass);
        fout2.write(mass);
        mass = new byte[k/2];
        fin1.read(mass);
        fout3.write(mass);
        fin1.close();
        fout2.close();
        fout3.close();

    }
}
