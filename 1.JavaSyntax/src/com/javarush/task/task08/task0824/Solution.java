package com.javarush.task.task08.task0824;                                                  
                                                  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                                                  
/*                                                   
Собираем семейство                                                  
*/                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) {                                                  
        //напишите тут ваш код                                                  
        Human reb1 = new Human("sdfsd", true,12,null);                                                  
        Human reb2 = new Human("sdfsd", true,12,null);                                                  
        Human reb3 = new Human("sdfsd", true,12,null);
        Human pap = new Human("sdf",false,45,  Arrays.asList(reb1,reb2,reb3));
        Human mam = new Human("sdf",true,45,  Arrays.asList(reb1,reb2,reb3));
        Human dad1 = new Human("sdf",true,75,  Arrays.asList(pap));
        Human dad2 = new Human("sdf",true,75,  Arrays.asList(mam));
        Human gmam1 = new Human("sdf",false,75,  Arrays.asList(pap));
        Human gmam2 = new Human("sdf",false,75,  Arrays.asList(mam));
        System.out.println(reb1);                                                  
        System.out.println(reb2);                                                  
        System.out.println(reb3);                                                  
        System.out.println(pap);                                                  
        System.out.println(mam);                                                  
        System.out.println(dad1);                                                  
        System.out.println(dad2);                                                  
        System.out.println(gmam1);                                                  
        System.out.println(gmam2);                                                  
    }                                                  
                                                  
    public static class Human {                                                  
        //напишите тут ваш код                                                  
         String name;
         boolean sex;
         int age;
         List<Human> children;
                                                  
        public Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;                                                  
            this.sex = sex;                                                  
            this.age = age;                                                  
            this.children = children;                                                  
        }                                                  
                                                  
        public String toString() {                                                  
            String text = "";                                                  
            text += "Имя: " + this.name;                                                  
            text += ", пол: " + (this.sex ? "мужской" : "женский");                                                  
            text += ", возраст: " + this.age;                                                  
              if (children!=null){
            int childCount = this.children.size();                                                  
            if (childCount > 0) {                                                  
                text += ", дети: " + this.children.get(0).name;                                                  
                                                  
                for (int i = 1; i < childCount; i++) {                                                  
                    Human child = this.children.get(i);                                                  
                    text += ", " + child.name;                                                  
                }                                                  
            } }
            return text;                                                  
        }                                                  
    }                                                  
}