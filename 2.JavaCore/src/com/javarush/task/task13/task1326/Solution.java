package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> massList = new ArrayList<>();
        FileInputStream fis = new FileInputStream(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));


        try {
            while (br.ready()) {

                massList.add(Integer.parseInt(br.readLine()));
            }
        }
        catch (IOException e){

        }
        br.close();
        Collections.sort(massList);
        for (int i:massList
             ) {if (i %2==0) System.out.println(i);

        }


    }
}
