package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        sc.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> list = new ArrayList<>();
        int max = 0;
        String s = null, s1 = null;
        while ((s1 = reader.readLine())!=null){
            s = new String(s1);
            s = s.substring(0,8);
            if (s.indexOf(" ")>0) {
                s = s.substring(0,s.indexOf(" "));
            }
            int currentIndex = Integer.parseInt(s);
            if (args.length>0 && args[0].equals("-u") && currentIndex==Integer.parseInt(args[1])){
                String result = "";
                result+= args[1];
                for (int i = 0; i < 8-args[1].length(); i++) {
                    result+=" ";
                }
                result+=args[2];
                for (int i = 0; i < 30-args[2].length(); i++) {
                    result+=" ";
                }
                result+=args[3];
                for (int i = 0; i < 8-args[3].length(); i++) {
                    result+=" ";
                }
                result+=args[4];
                for (int i = 0; i < 4-args[4].length(); i++) {
                    result+=" ";
                }
                s1 = result;
            }
            if (args.length>0 && args[0].equals("-d") && currentIndex==Integer.parseInt(args[1])){

            } else {
                list.add(s1);
            }

        }
        reader.close();
        FileOutputStream fos = new FileOutputStream(filename);
        for (String s2:list
             ) {
            fos.write((s2+"\n").getBytes());
        }
        fos.close();
    }


}
