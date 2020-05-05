package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        Date date = d.parse(sc.nextLine());
        //d = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).format(date).toUpperCase());
    }
}
