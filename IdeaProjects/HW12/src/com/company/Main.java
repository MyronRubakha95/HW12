package com.company;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        String args0 = "D:/Cursor/temp1.txt";
        String args1 = "D:/temp1.txt";


        try (FileReader inputStream = new FileReader(args0); FileWriter outputStream = new FileWriter(args1)) {

            int a;
            while ((a = inputStream.read()) != -1) {
                outputStream.write(a);
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }
}







