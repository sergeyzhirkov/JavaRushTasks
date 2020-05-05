package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        Collections.addAll(threads, new Thread1(), new Thread2(),new Thread3(), new Thread4(), new Thread5());
    }

    public static void main(String[] args) {
    }
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true);
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public static class Thread4 extends Thread implements Message{

        @Override
        public void showWarning() {
            interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted());
        }
    }
    public static class Thread5 extends Thread{
        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            while (sc.hasNextInt())
                sum+= Integer.parseInt(sc.nextLine());
            System.out.println(sum);
        }
    }
}