package ua.goit.java.lesson02.task01;

import java.util.Arrays;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class ArrayAnalyzer implements Analyzer {

    @Override
    public int sum(final int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    @Override
    public double sum(final double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    @Override
    public int min(final int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    @Override
    public double min(final double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    @Override
    public int max(final int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    @Override
    public double max(final double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    @Override
    public int maxPositive(final int[] array) {
        int max = max(array);
        return (max > 0) ? max : -1;
    }

    @Override
    public double maxPositive(final double[] array) {
        double max = max(array);
        return (max > 0) ? max : -1;
    }

    @Override
    public int multiplication(final int[] array) {
        int result = 1;
        for (int value : array) {
            result *= value;
        }
        return result;
    }

    @Override
    public double multiplication(final double[] array) {
        double result = 1;
        for (double value : array) {
            result *= value;
        }
        return result;
    }

    // modulus of first and last element
    @Override
    public int modulus(final int[] array) {
        return (array[0] % array[array.length - 1]);
    }

    @Override
    public double modulus(final double[] array) {
        return (array[0] % array[array.length - 1]);
    }

    @Override
    public int secondLargest(final int[] array) {
        Arrays.sort(array);
        return array[1];
    }

    @Override
    public double secondLargest(final double[] array) {
        Arrays.sort(array);
        return array[1];
    }
}
