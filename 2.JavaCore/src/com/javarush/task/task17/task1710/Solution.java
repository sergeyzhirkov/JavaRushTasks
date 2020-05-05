package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        //start here - начни тут
        if (args[0].equals("-i")){
            SimpleDateFormat outDate = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            Person p = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(p.getName()+(p.getSex()==Sex.MALE?" м ":" ж ")+ outDate.format(p.getBirthDate()));

        }
        if (args[0].equals("-d")) {
            Person p  = allPeople.get(Integer.parseInt(args[1]));
            p.setName(null);
            p.setSex(null);
            p.setBirthDate(null);
        }
        if (args[0].equals("-c")){
            Date birthday = dateFormat.parse(args[3]);
            if (args[2].equals("м")) allPeople.add(Person.createMale(args[1],birthday));
            else allPeople.add(Person.createFemale(args[1],birthday));
            System.out.println(allPeople.size()-1);
        }
        if (args[0].equals("-u")){
            Date birthday = dateFormat.parse(args[4]);
            Person p = ((args[3].equals("м")? Person.createMale(args[2],birthday):Person.createFemale(args[2],birthday)));
            allPeople.set(Integer.parseInt(args[1]), p);
        }

    }
}
