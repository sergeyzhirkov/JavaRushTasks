package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);
//        if (args[0].equals("-e")){
//            int i;
//            while ((i = fis.read())!=-1){
//                fos.write(256-i);
//            }
//        }

            int i;
            while ((i = fis.read())!=-1){
                fos.write(256-i);
            }
            fis.close();
            fos.close();

    }

}
