package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] arrayStrings = line.split(" ");
                int day = Integer.parseInt(arrayStrings[arrayStrings.length-3]);
                int month = Integer.parseInt(arrayStrings[arrayStrings.length-2]);
                int year = Integer.parseInt(arrayStrings[arrayStrings.length-1]);
                line = "";
                for (int i = 0; i < arrayStrings.length-4; i++) {
                    line+=arrayStrings[i] + " ";
                }
                line+= arrayStrings[arrayStrings.length-4];
                PEOPLE.add(new Person(line, new Date(year-1900,month-1,day)));
            }
//            System.out.println(PEOPLE.get(0).getName() + PEOPLE.get(0).getBirthDate());
//            System.out.println(PEOPLE.get(1).getName() + PEOPLE.get(1).getBirthDate());
        }
    }
}
