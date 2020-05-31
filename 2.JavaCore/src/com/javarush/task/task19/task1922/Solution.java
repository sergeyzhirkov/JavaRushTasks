package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))){
            String s;
            while ((s = fileReader.readLine()) != null){
                int count = 0;
                String[] arrayLine = s.split(" ");
                for (String line: words
                     ) {
                    for (String line2: arrayLine
                         ) {
                        if (line2.equals(line)){
                            count++;
                        }
                    }
                }
                if (count==2) {
                    System.out.println(s);
                }
            }
        }
        reader.close();
    }
}
