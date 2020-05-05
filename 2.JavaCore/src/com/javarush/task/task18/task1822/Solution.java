package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader reader = new BufferedReader(new FileReader(sc.nextLine()))) {
            String s;
            while ((s = reader.readLine())!=null){
                if (s.startsWith(args[0]+" ")){
                    System.out.println(s);
                }
            }
            //reader.close();

        } catch (Exception e){

        }

    }
}
