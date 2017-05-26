package ua.goit.java.lesson10.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        try {
            final String message = "My first exception!";
            throw new MyException(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
