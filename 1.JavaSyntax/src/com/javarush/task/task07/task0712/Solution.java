package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String > s = new ArrayList<String>();
        int sLengthMin = 100000;
        int sLengthMax =0;
        for (int i = 0; i <10 ; i++) {
            s.add(sc.nextLine());
            if (s.get(i).length()<sLengthMin) sLengthMin = s.get(i).length();
            if (s.get(i).length()>sLengthMax) sLengthMax = s.get(i).length();
        }
        for (int i = 0; i < 10; i++) {

            if (s.get(i).length() == sLengthMin || s.get(i).length()==sLengthMax) {System.out.println(s.get(i)); break;}
        }//напишите тут ваш код
    }
}
