package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0) {
            if (n%2==0) even++; else odd++;
            n/=10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
        //напишите тут ваш код
    }
}
