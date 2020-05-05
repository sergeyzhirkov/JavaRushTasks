package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(s)));
        while (!s.equals("exit")){
            bw.write((s = br.readLine())+'\n');
        }
        br.close();
        bw.close();
    }
}
