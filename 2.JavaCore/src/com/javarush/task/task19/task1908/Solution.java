package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String[] s;
            while (fileReader.ready()){
                s = fileReader.readLine().split(" ");
                for (String string: s
                     ) {
                    if (string.matches("\\d+")){
                        fileWriter.write(string+" ");
                    }
                }

            }

        } catch (IOException e){

        }
        reader.close();
    }
}
