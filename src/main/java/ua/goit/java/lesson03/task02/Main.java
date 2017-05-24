package ua.goit.java.lesson03.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int a = 5;
        final int b = 10;

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(a, b));

        final Adder adder = new Adder();
        System.out.println(adder.check(a, b));
    }
}
