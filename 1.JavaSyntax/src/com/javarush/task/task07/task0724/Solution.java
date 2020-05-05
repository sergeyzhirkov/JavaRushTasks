package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human ded1 = new Human("123",true,123);
        Human ded2 = new Human("123",true,123);
        Human bab1 = new Human("123",true,123);
        Human bab2 = new Human("123",true,123);

        Human father = new Human("123",true,123,ded1,bab1);
        Human mother = new Human("123",true,123,ded2,bab2);
        Human f1 = new Human("123",true,123,father,mother);Human f2 = new Human("123",true,123,father,mother);
        Human f3 = new Human("123",true,123,father,mother);
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());


    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}