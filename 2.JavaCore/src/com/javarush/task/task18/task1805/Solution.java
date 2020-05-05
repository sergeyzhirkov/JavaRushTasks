package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/


import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int[] masByte = new int[256];
        while (fin.available()  > 0 ){
            masByte[fin.read()]++;
        }
        fin.close();
//        int[] copyMas = masByte.clone();
//        Arrays.sort(copyMas);
//        for (int i = 0; i < copyMas[255] ; i++) {
//            for (int j = 0; j < 255; j++) {
//                if (masByte[j] == i){
//                    System.out.print(j+" ");
//                }
//            }
//        }
        for (int i = 0; i < 255; i++) {
            if (masByte[i]!=0){
                System.out.print(i+" ");
            }
        }
    }
}
