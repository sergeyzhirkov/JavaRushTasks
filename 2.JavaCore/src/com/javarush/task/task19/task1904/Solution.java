package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException{
//        PersonScannerAdapter psa = new PersonScannerAdapter(new Scanner(System.in));
//        System.out.println(psa.read().toString());

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;

        }

        @Override
        public Person read() throws IOException {
            String stFromFile = fileScanner.nextLine();
            String[] strings = stFromFile.split(" ");
            return new Person(strings[1],strings[2],strings[0],new Date(Integer.parseInt(strings[5])-1900
                    ,Integer.parseInt(strings[4])-1,
                    Integer.parseInt(strings[3])));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
