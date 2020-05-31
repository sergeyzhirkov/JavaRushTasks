package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))
        ){
            String s, s1 = "";
            while ((s = reader.readLine())!= null){
                String[] arrays = s.split(" ");
                for (String stroka:arrays
                     ) {
                    if (stroka.length()>6){
                        writer.write(s1);
                        writer.write(stroka);
                        s1 = ",";
                    }
                }
            }
        }
    }
}
