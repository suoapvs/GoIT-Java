package ua.goit.java.lesson11.task01;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class FileReplacer {

    private final File file;

    public FileReplacer(final File file) {
        this.file = file;
    }

    public FileReplacer(final String pathname) {
        this(new File(pathname));
    }

    public String replacer(final Map<String, String> map) {
        final String text = readFromFile();
        return replaceAll(text, map);
    }

    private String readFromFile() {
        String result;
        try {
            final FileReader reader = new FileReader(this.file);
            result = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        }
        return result;
    }

    private static String replaceAll(final String text, final Map<String, String> map) {
        String result = text;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String regex = entry.getKey();
            String replacer = entry.getValue();
            result = result.replaceAll(regex, replacer);
        }
        return result;
    }
}
