package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int[] massByte = new int[256];
        while (fin.available() > 0){
            massByte[fin.read()]++;
        }
        int[] copyMass = massByte.clone();
        Arrays.sort(copyMass);
        int k=0;
        fin.close();
        for (int i = 255; i >0 ; i--) {
            if (copyMass[i]!=0) {
                k = copyMass[i];
            }
        }
        for (int i = 0; i < 255; i++) {
            if (massByte[i]==k){
                System.out.print(i+" ");
            }
        }
    }
}
