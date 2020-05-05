package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man m = new Man("skjhfjd",343,"dfs");
        Man mm = new Man("dsfd",2343,"sfsdf");
        Woman w = new Woman("sdfds",234,"sdfd");
        Woman ww = new Woman("sdfd",343,"dsfsdf");
        System.out.println(m.toString());
        System.out.println(mm.toString());
        System.out.println(w.toString());
        System.out.println(ww.toString());//напишите тут ваш код
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    //напишите тут ваш код
}
