package ua.goit.java.lesson11.task02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class FileReader {

    private final File file;

    public FileReader(final File file) {
        this.file = file;
    }

    public FileReader(final String pathname) {
        this(new File(pathname));
    }

    public String read() throws IOException {
        try (final RandomAccessFile stream = new RandomAccessFile(this.file, "r")) {
            byte[] buf = new byte[(int) stream.length()];
            stream.read(buf);
            return new String(buf);
        }
    }
}
