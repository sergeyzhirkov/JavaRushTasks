package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception{
        String s = args[0];
        FileInputStream fis = new FileInputStream(s);
        List<Character> list = new ArrayList<>();
        int i;
        while ((i = fis.read())!=-1){
            if (
                    (Character.toLowerCase((char)i) >='a')
                    &&
                    (Character.toLowerCase((char)i) <='z')){

                list.add(Character.valueOf(Character.toLowerCase((char)i)));

            }
        }
        System.out.println(list.size());
        fis.close();
    }
}
