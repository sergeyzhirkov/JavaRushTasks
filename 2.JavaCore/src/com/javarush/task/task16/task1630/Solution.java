package com.javarush.task.task16.task1630;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        Scanner sc = new Scanner(System.in);
        firstFileName = sc.nextLine();
        secondFileName = sc.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String s;
        String st = "";
        @Override
        public void setFileName(String fullFileName) {
            s = fullFileName;
        }

        @Override
        public String getFileContent() {


            return st;
        }

        @Override
        public void run() {
            try {
                Scanner scan = new Scanner(new File(s));
                while (scan.hasNextLine()){
                    st +=scan.nextLine()+" ";
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
