package ua.goit.java.lesson02.task01;

import java.util.Arrays;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class ArrayAnalyzer implements Analyzer {

    @Override
    public int sum(final int[] array) {
        /*int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;*/
        return Arrays.stream(array).sum();
    }

    @Override
    public double sum(final double[] array) {
        /*int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;*/
        return Arrays.stream(array).sum();
    }

    @Override
    public int min(final int[] array) {
        final int minElementIndex = 0;
        return sortAndGet(array, minElementIndex);
    }

    @Override
    public double min(final double[] array) {
        final int minElementIndex = 0;
        return sortAndGet(array, minElementIndex);
    }

    @Override
    public int max(final int[] array) {
        final int maxElementIndex = array.length - 1;
        return sortAndGet(array, maxElementIndex);
    }

    @Override
    public double max(final double[] array) {
        final int maxElementIndex = array.length - 1;
        return sortAndGet(array, maxElementIndex);
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
        final int firstElementIndex = 0;
        final int lastElementIndex = array.length - 1;
        return (array[firstElementIndex] % array[lastElementIndex]);
    }

    // modulus of first and last element
    @Override
    public double modulus(final double[] array) {
        final int firstElementIndex = 0;
        final int lastElementIndex = array.length - 1;
        return (array[firstElementIndex] % array[lastElementIndex]);
    }

    @Override
    public int secondLargest(final int[] array) {
        final int secondLargestElementIndex = (array.length > 1) ? 1 : 0;
        return sortAndGet(array, secondLargestElementIndex);
    }

    @Override
    public double secondLargest(final double[] array) {
        final int secondLargestElementIndex = (array.length > 1) ? 1 : 0;
        return sortAndGet(array, secondLargestElementIndex);
    }

    private int sortAndGet(final int[] array, final int index) {
        Arrays.sort(array);
        return array[index];
    }

    private double sortAndGet(final double[] array, final int index) {
        Arrays.sort(array);
        return array[index];
    }
}
