package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            try {
                int a = 42 / 0;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getClass().toString());
        }
        //напишите тут ваш код
    }
}
