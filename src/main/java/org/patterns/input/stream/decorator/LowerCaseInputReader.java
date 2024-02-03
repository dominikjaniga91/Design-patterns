package org.patterns.input.stream.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputReader {
    public static void main(String[] args) throws IOException {
        String read = new LowerCaseInputReader().read("test.txt");
        String read2= new StandardReader().read("test.txt");
        System.out.println(read);
    }

    public String read(String path) throws IOException {
        int line;
        try (InputStream in = new LowerCaseInputStreamDecorator(
                new BufferedInputStream(
                        new FileInputStream(path)
                )
        )) {
            StringBuilder builder = new StringBuilder();
            while ((line = in.read()) >= 0) {
                builder.append((char) line);
            }
            return builder.toString();
        }
    }
}
