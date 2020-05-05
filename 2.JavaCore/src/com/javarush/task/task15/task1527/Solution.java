package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        url = url.substring(url.indexOf("?")+1)+"&";
        ArrayList<String> masStrok = new ArrayList<>();

        while (!url.equals("")){
            String s = url.substring(0,url.indexOf("&"));
            if (s.indexOf("=")<0) System.out.print(s+" ");
            else {
                String s1 = s.substring(0,s.indexOf("="));
                if (s1.equals("obj")) {
                    masStrok.add(s.substring(s.indexOf("=")+1));
                }
                System.out.print(s1+" ");
            }
            url = url.substring(url.indexOf("&")+1);
        }
        System.out.println();
        for (String s:masStrok
             ) {
            try {
                alert(Double.parseDouble(s));
            } catch (NumberFormatException e) {
                alert(s);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
