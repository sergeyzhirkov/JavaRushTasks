package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sc.nextLine())));
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sc.nextLine())));
        //FileOutputStream fos = new FileOutputStream("C:\\JAVA\\test2.txt");
        String s = "";
        PrintStream pr = new PrintStream(new FileOutputStream(sc.nextLine()));
        //System.setOut(pr);
        s=reader.readLine();
        String[] strings = s.split(" ");
        for (String st:strings
             ) {
            double d = Double.parseDouble(st);
            pr.print(Math.round(d)+" ");
        }
//        while (reader.ready()){
//            double i = reader.read();
//            //writer.write(((int)(i))+" ");
//            //fos.write((((int)i)+" ").getBytes());
//            //System.out.print((int)(i)+" ");
//            int x = (int)Math.round(i);
//            System.out.println(x);
//            s+=(char)x+"p";
//
//        }

        //fos.write(s.getBytes());
        //fos.close();
        reader.close();
        //writer.close();
        pr.close();
    }
}
