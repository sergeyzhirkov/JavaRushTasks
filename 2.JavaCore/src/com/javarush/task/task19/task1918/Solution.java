package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.parser.Parser;
//import org.jsoup.select.Elements;
//import org.jsoup.nodes.Element;



public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String s = "";
        while (fileReader.ready()){
            s+= fileReader.readLine();
        }
        fileReader.close();
//        Document document = Jsoup.parse(s,"",Parser.xmlParser());
//        Elements elements = document.select(args[0]);
//        for (Element element: elements
//             ) {
//            System.out.println(element);
//        }



    }
}
