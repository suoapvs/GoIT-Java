package ua.goit.java.lesson10.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final MyClass myClass = new MyClass();

        try {
            myClass.f();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            myClass.g();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
