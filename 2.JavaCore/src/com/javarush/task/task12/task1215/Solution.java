package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {
        B p = new B();
        p.setI(8);
        System.out.println(p.getI()+" "+p.i);
    }
}


