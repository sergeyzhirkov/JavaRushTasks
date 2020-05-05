package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<Integer>(),
                arr3 = new ArrayList<Integer>(),
                arr2 = new ArrayList<Integer>(),
                arro = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            arrN.add(sc.nextInt());
            if (arrN.get(i) % 3 == 0) arr3.add(arrN.get(i));
            if (arrN.get(i) % 2 == 0) arr2.add(arrN.get(i));
            if (arrN.get(i) % 3 != 0 && arrN.get(i) % 2 !=0) arro.add(arrN.get(i));
        }
        Solution.printList(arr3);
        Solution.printList(arr2);
        Solution.printList(arro);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list){
            System.out.println(x);
        }
        //напишите тут ваш код
    }
}
