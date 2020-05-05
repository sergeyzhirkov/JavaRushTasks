package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        ArrayList<String > arInt = new ArrayList<String>();
        int n = Integer.parseInt(sc.nextLine()), m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            arInt.add(sc.nextLine());
        }
        Collections.rotate(arInt,n-m);
        for (String x: arInt
             ) {
            System.out.println(x);

        }
        //напишите тут ваш код
    }
}
