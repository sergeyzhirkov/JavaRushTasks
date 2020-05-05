package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int minByte = Integer.MAX_VALUE;
        while (fin.available()>0){
            int i = fin.read();
            if (minByte>i) {
                minByte = i;
            }
        }
        System.out.println(minByte);
        fin.close();
    }
}
