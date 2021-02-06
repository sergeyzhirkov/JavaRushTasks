package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String s;
        ArrayList<String> words = new ArrayList<>();
        //Set<String> reversStringSet = new HashSet<>();

        StringBuilder stringBuilder;
        while ((s = bf.readLine()) != null) {
            String[] arr = s.split(" ");
            for (String s1 : arr) {
                words.add(s1);
//                stringBuilder = new StringBuilder(s1);
//                stringBuilder.reverse();
                //reversStringSet.add(stringBuilder.toString());
            }
        }
        bufferedReader.close();
        bf.close();
//        for (String s1 : stringSet) {
//            if (reversStringSet.contains(s1)) {
//                Pair pair = new Pair();
//                pair.first = s1;
//                pair.second = (new StringBuilder(s1)).reverse().toString();
//                result.add(pair);
//                reversStringSet.remove((new StringBuilder(s1).reverse().toString()));
//                //System.out.println(pair);
//            }
//        }
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); ) {
                if (i >= words.size()) {
                    break;
                }
                if (words.get(j).equals(new StringBuilder(words.get(i)).reverse().toString()) && j != i) {
                    Pair pair = new Pair();
                    pair.first = words.get(j);
                    pair.second = words.get(i);
                    result.add(pair);
                    words.remove(j);
                    words.remove(i);
                    j = 0;
                } else
                    j++;
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
