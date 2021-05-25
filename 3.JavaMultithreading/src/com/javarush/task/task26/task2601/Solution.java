package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sort(new Integer[]{13, 8, 15, 5, 17})));
//        System.out.println(3 / 2);
    }

    public static Integer[] sort(Integer[] array) {
        int[] sortMass = Arrays.stream(array).mapToInt(x -> x).sorted().toArray();
        double mediana;
        if (array.length % 2 == 1) {
            mediana = sortMass[array.length / 2];
        } else {
            mediana = (sortMass[array.length / 2] + sortMass[(array.length + 1) / 2]) / 2.0;
        }
        return Arrays.stream(array)
                .sorted(Comparator.<Integer, Double>comparing(x -> Math.abs(x - mediana)).thenComparing(Function.identity()))
                .collect(Collectors.toList()).toArray(new Integer[0]);
    }
}
