package com.javarush.task.task06.task0621;

//import com.javarush.task.task06.task0611.StringHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String deda = reader.readLine();
        Cat catDeda = new Cat(deda);
        String baba = reader.readLine();
        Cat catBaba = new Cat(baba);

        String papa = reader.readLine();
        Cat catPapa = new Cat(papa,null,catDeda);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBaba, null);

        String dName = reader.readLine();
        Cat catD = new Cat(dName, catMother, catPapa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catPapa);

        System.out.println(catDeda);
        System.out.println(catBaba);
        System.out.println(catPapa);
        System.out.println(catMother);
        System.out.println(catD);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentm;
        private Cat parentp;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            parentm = parent1;
            parentp = parent2;
        }
        @Override
        public String toString() {
            String s = "";
            if (parentm == null)
                s = "The cat's name is " + name + ", no mother";
            else
                s= "The cat's name is " + name + ", mother is " + parentm.name;
            if (parentp == null)
                return s+", no father";
            else return s+", father is "+parentp.name;
        }
    }

}
