package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
Scanner sc = new Scanner(System.in);
int i  = sc.nextInt();
if (i==0) System.out.println("ноль");
else {
    if (i>0) System.out.print("положительное "); else System.out.print("отрицательное ");
    if (i%2==0) System.out.print("четное число"); else System.out.print("нечетное число");
}

    }
}
