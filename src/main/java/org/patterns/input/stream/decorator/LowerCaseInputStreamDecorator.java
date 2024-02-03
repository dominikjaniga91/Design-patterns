package org.patterns.input.stream.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamDecorator extends FilterInputStream {


    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStreamDecorator(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = in.read();
        return (read == -1 || ((char) read) == ' ' ? read : read | 32);
//        return (read == -1 ? read : Character.toLowerCase((char) read));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
