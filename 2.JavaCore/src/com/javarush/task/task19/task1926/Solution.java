package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))){
            while (fileReader.ready()){
            StringBuffer sf = new StringBuffer(fileReader.readLine());
            System.out.println(sf.reverse());
        }
        }
        reader.close();
    }
}
