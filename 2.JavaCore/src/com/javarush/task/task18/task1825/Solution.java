package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String s, ss = "";
        int max = 0;

        while (!(s = sc.nextLine()).equals("end")){
            int lastIndex = s.lastIndexOf(".part");
            String st = s.substring(lastIndex+5,s.length());
            int i = Integer.parseInt(st);

            max = Math.max(max, i );
            ss = s;
        }
        s = ss;
        s = s.substring(0,s.lastIndexOf(".part"));
        FileOutputStream fos = new FileOutputStream(s,true);
        //byte[] arrayOfByte;
        for (int i = 1; i <= max ; i++) {
            //System.out.println(s+".part"+i);
            FileInputStream fis = new FileInputStream(s+".part"+i);
            //arrayOfByte = new byte[fis.available()];
            //fis.read(arrayOfByte);
            //fos.write(arrayOfByte);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int bite;
            while ((bite = bis.read())!=-1){
                fos.write(bite);
            }
            bis.close();
            fis.close();
        }
        fos.close();
    }
}
