package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();//напишите тут ваш код

    }

    public static int readInt() throws Exception {
        return Integer.parseInt(ConsoleReader.readString());//напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        return Double.parseDouble(ConsoleReader.readString());//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        return  (ConsoleReader.readString().equals("true"));//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

    }
}
