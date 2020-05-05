package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream(sc.nextLine());
        int[] massByte = new int[256];
        int[] copyMass;
        while (fin.available() > 0){
            massByte[fin.read()]++;
        }
        copyMass = massByte.clone();
        Arrays.sort(copyMass);
        fin.close();
        for (int i = 0; i < 255; i++) {
            if (massByte[i] == copyMass[255]){
                System.out.print(i+" ");
            }
        }
    }

}
