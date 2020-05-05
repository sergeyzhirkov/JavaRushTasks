package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine()), b = Integer.parseInt(sc.nextLine());
        if (a<0 || b<0) throw new Exception();
        while (true){
            if (a>b) a = a % b; else b = b % a;
            if (a==0 || b==0) {System.out.println(a+b); break;}
        }
    }
}
