package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (sc.hasNextLine()){
            if (!(s = sc.nextLine()).equals("exit")){
                new ReadThread(s).start();
            }  else {
                break;
            }
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int[] arrayOfByte = new int[256];
            int max = 0;
            try (FileInputStream fis = new FileInputStream(fileName)) {
                while (fis.available()>0){
                    arrayOfByte[fis.read()]++;

                }
                for (int i = 0; i <= 255 ; i++) {
                    if (arrayOfByte[max] < arrayOfByte[i]){
                        max = i;
                    }
                }
                resultMap.put(fileName, max);

            } catch (IOException e){

            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
