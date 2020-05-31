package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()))) {
            ArrayList<String> arrayS1 = new ArrayList<>();
            ArrayList<String> arrayS2 = new ArrayList<>();
            while (reader1.ready()){
                arrayS1.add(reader1.readLine());
            }
            while (reader2.ready()){
                arrayS2.add(reader2.readLine());
            }
            int i =0;
            while (i < arrayS1.size() && i<arrayS2.size()) {

                if (arrayS1.get(i).equals(arrayS2.get(i))){
                    lines.add(new LineItem(Type.SAME, arrayS1.get(i)));
                    arrayS1.remove(i);
                    arrayS2.remove(i);

                } else


                    if(arrayS2.size()==1||!arrayS1.get(i).equals(arrayS2.get(i+1))){
                    lines.add(new LineItem(Type.REMOVED,arrayS1.get(i)));
                    arrayS1.remove(i);

                } else {
                    lines.add(new LineItem(Type.ADDED,arrayS2.get(i)));
                    arrayS2.remove(i);

                }


            }
            while (!arrayS1.isEmpty()){
                lines.add(new LineItem(Type.REMOVED,arrayS1.get(0)));
                arrayS1.remove(0);
            }
            while (!arrayS2.isEmpty()){
                lines.add(new LineItem(Type.ADDED,arrayS2.get(0)));
                arrayS2.remove(0);
            }
        } catch (IOException e){

        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
