package ua.goit.java.lesson02.task01;

import java.util.Random;

/**
 * 2.1. Input: array with size = 10 can be of one of two data types: int and double.
 * Calculate:
 * - sum
 * - min/max
 * - max positive
 * - multiplication
 * - modulus of first and last element
 * - second largest element
 * <p>
 * As a result you should have methods with following names :
 * - sum(int array[]), sum(double[])
 * - min(int array[]), min(double[])
 * - max(int array[]), max(double[])
 * - maxPositive(int array[]), maxPositive(double array[]),
 * - multiplication  (int array[]), multiplication (double[])
 * - modulus(int array[]), modulus(double[])
 * - secondLargest(int array[]), secondLargest(double[])
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        final Analyzer analyzer = getAnalyzer();

        final int length = 10;
        final int[] intArray = createIntArray(length);
        System.out.println("Integer Array:");
        System.out.println("sum(int[] array) = " + analyzer.sum(intArray));
        System.out.println("min(int[] array) = " + analyzer.min(intArray));
        System.out.println("max(int[] array) = " + analyzer.max(intArray));
        System.out.println("maxPositive(int[] array) = " + analyzer.maxPositive(intArray));
        System.out.println("multiplication(int[] array) = " + analyzer.multiplication(intArray));
        System.out.println("modulus(int[] array) = " + analyzer.modulus(intArray));
        System.out.println("secondLargest(int[] array) = " + analyzer.secondLargest(intArray));

        final double[] doubleArray = createDoubleArray(length);
        System.out.println("\nDouble Array:");
        System.out.println("sum(double[] array) = " + analyzer.sum(doubleArray));
        System.out.println("min(double[] array) = " + analyzer.min(doubleArray));
        System.out.println("max(double[] array) = " + analyzer.max(doubleArray));
        System.out.println("maxPositive(double[] array) = " + analyzer.maxPositive(doubleArray));
        System.out.println("multiplication(double[] array) = " + analyzer.multiplication(doubleArray));
        System.out.println("modulus(double[] array) = " + analyzer.modulus(doubleArray));
        System.out.println("secondLargest(double[] array) = " + analyzer.secondLargest(doubleArray));
    }

    private static int[] createIntArray(final int length) {
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = RANDOM.nextInt();
        }
        return array;
    }

    private static double[] createDoubleArray(final int length) {
        final double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = RANDOM.nextDouble();
        }
        return array;
    }

    private static Analyzer getAnalyzer() {
        return new ArrayAnalyzer();
    }
}
