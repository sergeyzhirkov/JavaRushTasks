package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);
        String[] arrayStrings = outputStream.toString().split(" ");
        if (arrayStrings[1].equals("+")) {
            System.out.println(outputStream.toString()+(Integer.parseInt(arrayStrings[0])+Integer.parseInt(arrayStrings[2])));
        }
        if (arrayStrings[1].equals("-")) {
            System.out.println(outputStream.toString()+(Integer.parseInt(arrayStrings[0])-Integer.parseInt(arrayStrings[2])));
        }
        if (arrayStrings[1].equals("*")) {
            System.out.println(outputStream.toString()+(Integer.parseInt(arrayStrings[0])*Integer.parseInt(arrayStrings[2])));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

