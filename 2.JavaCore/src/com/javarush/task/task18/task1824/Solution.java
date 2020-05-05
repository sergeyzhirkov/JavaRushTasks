package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(s);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(s);
                break;
            }
//            finally {
//                fis.close();
//            }
        }
    }
}
