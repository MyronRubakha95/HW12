package com.company;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        String args0 = "D:/Cursor/temp1.txt";
        String args1 = "D:/temp1.txt";


        File file = new File(args1);
        file.createNewFile();
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(args0);
            outputStream = new FileWriter(args1);

            int a;
            while ((a = inputStream.read()) != -1) {
                outputStream.write(a);
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());

        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}







