package ua.goit.java.lesson02.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface Analyzer {

    int sum(int[] array);

    double sum(double[] array);

    int min(int[] array);

    double min(double[] array);

    int max(int[] array);

    double max(double[] array);

    int maxPositive(int[] array);

    double maxPositive(double[] array);

    int multiplication(int[] array);

    double multiplication(double[] array);

    // modulus of first and last element
    int modulus(int[] array);

    // modulus of first and last element
    double modulus(double[] array);

    int secondLargest(int[] array);

    double secondLargest(double[] array);
}
