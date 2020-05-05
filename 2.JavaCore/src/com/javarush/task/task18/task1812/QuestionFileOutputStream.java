package com.javarush.task.task18.task1812;

/* 
Расширяем AmigoOutputStream
*/

import java.io.IOException;
import java.util.Scanner;

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream comp;

    public QuestionFileOutputStream(AmigoOutputStream comp) {
        this.comp = comp;
    }

    @Override
    public void flush() throws IOException {
        comp.flush();
    }

    @Override
    public void write(int b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        comp.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("Д")){
            comp.close();
        }
    }
}

