package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            long number = Long.parseLong(args[1]);
            String text = args[2];
            raf.seek(number);
            int endNumber = (int) Math.min(number + text.length(), raf.length() - number);
            byte[] arr = new byte[text.length()];
            raf.read(arr, 0, text.length());
            String incString = new String(arr);
            raf.seek(raf.length());
            if (incString.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (Exception ignored) {
        }
    }
}
