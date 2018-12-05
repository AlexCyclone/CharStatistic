package icu.cyclone.alex.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextReader {
    public static StringBuffer readFile(File file) {

        StringBuffer sb = new StringBuffer();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            return null;
        }
        return sb;
    }
}
