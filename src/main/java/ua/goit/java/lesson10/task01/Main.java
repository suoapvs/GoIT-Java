package ua.goit.java.lesson10.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        try {
            final String message = "My first exception!";
            throw new Exception(message);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("It's finally block!");
        }
    }
}
