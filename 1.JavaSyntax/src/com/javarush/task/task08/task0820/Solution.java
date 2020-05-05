package com.javarush.task.task08.task0820;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>(Arrays.asList(new Cat(),new Cat(),new Cat(),new Cat()));

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        return new HashSet<Dog>(Arrays.asList(new Dog(),new Dog(),new Dog()));
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> sett = new HashSet<>();
        sett.addAll(cats);
        sett.addAll(dogs);
        return sett;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Cat c:cats
             ) {pets.remove(c);

        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object c: pets
             ) {
            System.out.println(c);

        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
    //напишите тут ваш код
}
