package icu.cyclone.alex;

import icu.cyclone.alex.utils.TextReader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filename = "text.txt";
        CharStatistic cs = new CharStatistic(TextReader.readFile(new File(filename)).toString());
        System.out.println(cs);
    }
}
