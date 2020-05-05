package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> massiv = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                massiv.add(sc.nextInt());
            }
        }
        catch (Exception e){
            for (int i:massiv
                 ) {
                System.out.println(i);

            }
        }
    }
}
