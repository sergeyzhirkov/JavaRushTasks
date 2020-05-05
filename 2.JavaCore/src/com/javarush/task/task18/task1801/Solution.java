package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int maxByte  = 0;
        while (fin.available()>0){
            int i = fin.read();
            if (i>maxByte) {
                maxByte = i;
            }
        }
        fin.close();
        System.out.println(maxByte);
    }
}
