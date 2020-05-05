package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    for (int i = 0; i < args.length-1; i=i+3) {
                        Date birthday = dateFormat.parse(args[i+3]);
                        if (args[i+2].equals("м")) allPeople.add(Person.createMale(args[i+1],birthday));
                        else allPeople.add(Person.createFemale(args[i+1],birthday));
                        System.out.println(allPeople.size()-1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople){
                    for (int i = 0; i < args.length-1; i=i+4) {
                        Date birthday = dateFormat.parse(args[i+4]);
                        Person p = ((args[i + 3].equals("м") ? Person.createMale(args[i+2], birthday) : Person.createFemale(args[i+2], birthday)));
                        allPeople.set(Integer.parseInt(args[i+1]), p);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople){
                    for (int i = 0; i <args.length-1 ; i++) {
                        Person p  = allPeople.get(Integer.parseInt(args[i+1]));
                        p.setName(null);
                        p.setSex(null);
                        p.setBirthDate(null);
                    }
                } break;
            case "-i":
                synchronized (allPeople){
                    for (int i = 0; i <args.length-1 ; i++) {
                        SimpleDateFormat outDate = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                        Person p = allPeople.get(Integer.parseInt(args[i+1]));
                        System.out.println(p.getName()+(p.getSex()==Sex.MALE?" м ":" ж ")+ outDate.format(p.getBirthDate()));

                    }
                } break;
        }
    }
}
