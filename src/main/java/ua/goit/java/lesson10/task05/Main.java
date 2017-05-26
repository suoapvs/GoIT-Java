package ua.goit.java.lesson10.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final MyClass myClass = new MyClass();
        try {
            myClass.throwsRandomException();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
