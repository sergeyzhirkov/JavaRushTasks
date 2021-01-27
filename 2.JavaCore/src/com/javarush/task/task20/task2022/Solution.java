package com.javarush.task.task20.task2022;

import java.io.*;
/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName,true);
        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception{
        Solution solution = new Solution("test.txt");
        solution.writeObject("string1");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test1.txt"));
        out.writeObject(solution);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test1.txt"));
        solution = (Solution) in.readObject();
        solution.writeObject("string2");
    }
}
