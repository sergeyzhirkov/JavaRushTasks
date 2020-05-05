package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<FileInputStream> arr = new ArrayList<>();

        try {
            while (true){
                arr.add(new FileInputStream(sc.nextLine())) ;
                if (arr.get(arr.size()-1).available()<1000){
                    throw new DownloadException();
                }
            }
        }  catch (DownloadException e) {
            for (FileInputStream fin:arr
                 ) {
                fin.close();
            }
            throw new DownloadException();
        }
    }

    public static class DownloadException extends Exception {

    }
}
