package com.javarush.task.task15.task1519;

import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner sc = new Scanner(System.in);
        String s="";
        while (true){
            s = sc.nextLine();
            double d = 0.0123;
            if (s.equals("exit")){sc.close();break; } else {
                try {
                    d = Double.parseDouble(s);

                    int i = Integer.parseInt(s);
                    if (i>0 && i<128) print((short)i); else print(i);
                } catch (NumberFormatException e) {
                    if (Math.abs(d-0.0123)>0.000001) print(d);
                        else
                    print(s);
                }

            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
