package ua.goit.java.lesson11.task04;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class FileWriter {

    private final File file;

    public FileWriter(final File file) {
        this.file = file;
    }

    public FileWriter(final String pathname) {
        this(new File(pathname));
    }

    public void write(final String text) throws IOException {
        try (final RandomAccessFile out = new RandomAccessFile(this.file, "rw")) {
            byte[] buf = text.getBytes();
            out.setLength(0);
            out.write(buf);
        }
    }
}
