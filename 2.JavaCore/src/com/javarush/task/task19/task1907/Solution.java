package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countWorld = 0;
        try (BufferedReader readWorld = new BufferedReader(new FileReader(reader.readLine()))) {
            while (readWorld.ready()){

                String s = readWorld.readLine();
//                System.out.println(s);

                countWorld+=
                      (" "+s+" ")
                        .replaceAll("\\."," ")
                        .replaceAll(","," ")
                        .replaceAll("\\?"," ")
                        .replaceAll("!"," ")
                        .replaceAll(":"," ")
                        .replaceAll(";"," ")
                                .replaceAll("-"," ")
                                .replaceAll("\""," ")
                                .replaceAll("'"," ")
                        .replaceAll(" ","  ")
                .split(" world ").length - 1;
            }
        }
        reader.close();
        System.out.println(countWorld);
    }
}
