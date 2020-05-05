package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream fout;
    public AmigoOutputStream(FileOutputStream fout) throws FileNotFoundException {
        super(fileName);
        this.fout = fout;
    }

    @Override
    public void write(int b) throws IOException {
        fout.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fout.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fout.write(b, off, len);
    }

    @Override
    public FileChannel getChannel() {
        return fout.getChannel();
    }



    @Override
    public void flush() throws IOException {
        fout.flush();
    }

    @Override
    public void close() throws IOException {
        fout.flush();
        fout.write("JavaRush © All rights reserved.".getBytes());
        fout.close();
    }

    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
