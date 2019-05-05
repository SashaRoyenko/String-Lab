package com.robosh.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static String read(String path) {
        StringBuilder readString = new StringBuilder();
        String line;
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                readString.append(line);
            }

        } catch (IOException ex) {
            System.out.println("Error when file was reading!");
            ex.printStackTrace();
        }
        return readString.toString().trim();
    }
}
