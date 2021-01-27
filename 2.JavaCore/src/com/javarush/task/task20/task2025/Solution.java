package com.javarush.task.task20.task2025;

import java.util.Arrays;

/* 
Алгоритмы-числа
*/
public class Solution {

    public static long[] getNumbers(long N) {
        long[] mas = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 371, 370, 407, 1634, 8208, 9474, 92727, 93084, 54748, 548834, 1741725, 4210818, 9926315, 9800817, 24678051, 24678050, 88593477, 146511208, 912985153, 472335975, 534494836, 4679307774l, 32164049651l, 94204591914l, 32164049650l, 82693916578l, 40028394225l, 42678290603l, 44708635679l, 49388550606l, 28116440335967l, 4338281769391371l, 4338281769391370l, 21897142587612075l, 35641594208964132l, 35875699062250035l, 4498128791164624869l, 1517841543307505039l, 3289582984443187032l, 4929273885928088826l};
        Arrays.sort(mas);


//                {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727,
//                93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208,
//                472335975, 534494836, 912985153, 4679307774, 32164049650, 32164049651, 40028394225, 42678290603,
//                44708635679, 49388550606, 82693916578, 94204591914};
        int k=0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]<N) k++;
        }
        long[] result = new long[k];
        for (int i = 0; i < k; i++) {
            result[i] = mas[i];
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
