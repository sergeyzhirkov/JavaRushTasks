package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] arrayOfSolutions = new Solution[2];
        arrayOfSolutions[0] = new Solution();
        arrayOfSolutions[0].innerClasses[0] = new Solution(). new InnerClass();
        arrayOfSolutions[0].innerClasses[1] = new Solution(). new InnerClass();
        arrayOfSolutions[1] = new Solution();
        arrayOfSolutions[1].innerClasses[0] = new Solution(). new InnerClass();
        arrayOfSolutions[1].innerClasses[1] = new Solution(). new InnerClass();
        return arrayOfSolutions;
    }

    public static void main(String[] args) {

    }
}
