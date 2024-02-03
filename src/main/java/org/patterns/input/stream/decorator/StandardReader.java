package org.patterns.input.stream.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StandardReader {

    public String read(String path) throws IOException {
        int line;
        try (InputStream in = new BufferedInputStream(
                        new FileInputStream(path)
        )) {
            StringBuilder builder = new StringBuilder();
            while ((line = in.read()) >= 0) {
                builder.append((char)line | 32);
            }
            return builder.toString().toLowerCase();
        }
    }
}
