package ua.goit.java.lesson10.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Object object = null;
            object.hashCode();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
