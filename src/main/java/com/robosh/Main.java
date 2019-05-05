package com.robosh;

import com.robosh.Reader.ReadFromFile;

import java.io.File;

public class Main {
    private static final String PATH = "target" + File.separator + "classes" + File.separator + "sentence";

    public static void main(String[] args) {
        String str = ReadFromFile.read(PATH);
        System.out.println(TextParser.getText(str));
        System.out.println(TextParser.getSortedText(TextParser.getText(str)));
    }
}