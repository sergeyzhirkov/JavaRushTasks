package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Collections;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        Collections.addAll(arr,"asd","sdf","sdf","sdff","sdfd");
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.toString());
        }
    }
}
