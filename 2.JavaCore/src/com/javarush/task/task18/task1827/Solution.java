package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        sc.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        int max = 0;
        String s = null;
        while ((s = reader.readLine())!=null){
            s = s.substring(0,8);
            if (s.indexOf(" ")>0) {
                s = s.substring(0,s.indexOf(" "));
            }
            max = Math.max(max, Integer.parseInt(s));


        }
        reader.close();
        if (args.length!=0 && args[0].equals("-c")){

            //PrintStream writer = new PrintStream(filename);
            FileOutputStream fos = new FileOutputStream(filename, true);
            String result = "\n";
            result+= ""+(max+1);
            for (int i = 0; i < 8-Integer.toString(max+1).length(); i++) {
                result+=" ";
            }
            result+=args[1];
            for (int i = 0; i < 30-args[1].length(); i++) {
                result+=" ";
            }
            result+=args[2];
            for (int i = 0; i < 8-args[2].length(); i++) {
                result+=" ";
            }
            result+=args[3];
            for (int i = 0; i < 4-args[3].length(); i++) {
                result+=" ";
            }
//            writer.println(result);
//            writer.close();
            fos.write(result.getBytes());
            fos.close();
        }
    }
}
