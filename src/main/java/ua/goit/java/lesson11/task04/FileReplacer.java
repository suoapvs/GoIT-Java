package ua.goit.java.lesson11.task04;

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

    public File fileContentReplacer(final Map<String, String> map) {
        final String result = replacer(map);
        writeToFile(result);
        return this.file;
    }

    public File fileContentMerger(final Map<String, String> map) {
        final String text = readFromFile();
        final String replacedText = replaceAll(text, map);
        final String result = text + "\n" + replacedText;
        writeToFile(result);
        return this.file;
    }

    public int checkWord(final String word) {
        final String text = readFromFile();
        int count = 0;
        for (String wordFromText : text.split(" ")) {
            if (wordFromText.equals(word)) {
                count++;
            }
        }
        return count;
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

    private void writeToFile(final String text) {
        try {
            final FileWriter writer = new FileWriter(this.file);
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
