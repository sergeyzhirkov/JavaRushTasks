package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arInt = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            arInt.add(sc.nextInt());
        }
        Collections.reverse(arInt);
        for (Integer x:arInt
             ) {
            System.out.println(x);
        }

        //напишите тут ваш код
    }
}
