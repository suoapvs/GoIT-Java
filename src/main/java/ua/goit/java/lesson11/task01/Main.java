package ua.goit.java.lesson11.task01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Map<String, String> map = new HashMap<>();
        map.put("Hello", "olleH");
        map.put("World", "dlroW");

        final String path = "c:/1.txt";
        final FileReplacer replacer = new FileReplacer(path);

        final String resultText = replacer.replacer(map);
        System.out.println(resultText);
    }
}
