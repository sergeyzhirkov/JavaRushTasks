package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
        System.out.println("Меня зовут "+s+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
