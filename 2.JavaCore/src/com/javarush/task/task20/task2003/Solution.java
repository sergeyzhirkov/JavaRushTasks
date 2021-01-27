package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        try(PrintWriter writer = new PrintWriter(outputStream)){
            Properties prop = new Properties();
            for (String s:runtimeStorage.keySet()
                 ) {
                prop.setProperty(s,runtimeStorage.get(s));
                //writer.println(s + " : " + runtimeStorage.get(s));
            }
            prop.store(writer,"");
        }
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            String s;
            Properties prop = new Properties();
            prop.load(reader);
//            while ((s = reader.readLine()) != null){
//                runtimeStorage.put(s.split(" : ")[0],s.split(" : ")[1]);
//            }
            for (String st: prop.stringPropertyNames()
                 ) {
                runtimeStorage.put(st,prop.getProperty(st));
            }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
