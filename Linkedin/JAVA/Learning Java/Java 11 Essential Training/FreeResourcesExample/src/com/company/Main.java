package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");
        createFileIfNotExists(file);
        readFile(file);
    }

    //Free resources
    private static void readFile(File file) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    //Not freeing resources
    private static void readFileVeryBad(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    //freeing resources but very complex way
    private static void readFileLittleBad(File file) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } finally {
            try {
                if (bufferedReader instanceof Closeable) {
                    bufferedReader.close();
                }
                if (fileReader instanceof Closeable) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Oh my god!");
            }
        }
    }

    private static void createFileIfNotExists(File file) {
        try {
            if (!file.exists())
                file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
