package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private int p1;
        private char p2;
        private String p3;
        private int p4;
        private int p5;
        private int p6;

        public Human(int p1) {
            this.p1 = p1;
        }

        public Human(int p1, char p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public Human(int p1, char p2, String p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public Human(int p1, char p2, String p3, int p4) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }

        public Human(int p1, char p2, String p3, int p4, int p5) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.p5 = p5;
        }

        public Human(int p1, char p2, String p3, int p4, int p5, int p6) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.p5 = p5;
            this.p6 = p6;
        }

        public Human(int p1, int p4, int p5, int p6) {
            this.p1 = p1;
            this.p4 = p4;
            this.p5 = p5;
            this.p6 = p6;
        }

        public Human(int p1, char p2, int p4, int p5, int p6) {
            this.p1 = p1;
            this.p2 = p2;
            this.p4 = p4;
            this.p5 = p5;
            this.p6 = p6;
        }

        public Human(char p2, String p3, int p4, int p5, int p6) {
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.p5 = p5;
            this.p6 = p6;
        }

        public Human(char p2, String p3) {
            this.p2 = p2;
            this.p3 = p3;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
