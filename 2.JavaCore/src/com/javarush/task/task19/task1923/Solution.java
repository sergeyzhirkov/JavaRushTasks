package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))
        ){
            String s;
            while ((s = reader.readLine())!= null){
                String[] arrayLine = s.split(" ");
                for (String string: arrayLine
                     ) {
                    if ((string.split("[0-9]").length>1) || (string.split("[0-9]").length==0)){
                        writer.write(string+" ");
                        //System.out.println(string);
                    }
                }
            }
        }
    }
}
