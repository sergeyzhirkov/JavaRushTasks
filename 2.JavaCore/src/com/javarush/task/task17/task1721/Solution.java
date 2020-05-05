package com.javarush.task.task17.task1721;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = null;
        try {
            sc1 = new Scanner(new File(sc.nextLine()));
        } catch (FileNotFoundException e) {

        }
        while (sc1.hasNextLine()){
            allLines.add(sc1.nextLine());
        }

        try {
            sc1 = new Scanner(new File(sc.nextLine()));
        } catch (FileNotFoundException e) {

        }
        while (sc1.hasNextLine()){
            forRemoveLines.add(sc1.nextLine());
        }
        sc.close();
        sc1.close();
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {

        }
    }

    public void joinData() throws CorruptedDataException {
        boolean t = true;
        for (String s:forRemoveLines
             ) {
            if (!allLines.contains(s)) t = false;

        }
        if (t) for (String s:forRemoveLines
                    ) {
            while (allLines.contains(s)) allLines.remove(s);

        }
        else {
            allLines = new ArrayList<>();
            throw new CorruptedDataException();
        }

    }
}
