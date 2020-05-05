package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int k=0;
        while (fin.available()>0){
            if (fin.read() == (int)','){
                k++;
            }
        }
        System.out.println(k);
        fin.close();
    }
}
