package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Could not create file");
                return;
            }
        }

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            do {
                String res = bufferedReader.readLine();
                if (res != null)
                    System.out.println(res);
                else
                    break;
            }
            while (true);
        } catch (IOException e) {
            System.out.println("Could read from file");
            return;
        }
    }
}