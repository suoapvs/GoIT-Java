package ua.goit.java.lesson06.task05;

import java.util.Arrays;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class ArraysUtils {

    public static int sum(int array[]) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int min(final int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(final int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(final int[] array) {
        int max = max(array);
        return (max > 0) ? max : -1;
    }

    public static int multiplication(final int[] array) {
        int result = 1;
        for (int value : array) {
            result *= value;
        }
        return result;
    }

    public static int modulus(final int[] array) {
        return (array[0] % array[array.length - 1]);
    }

    public static int secondLargest(final int[] array) {
        Arrays.sort(array);
        return array[1];
    }

    public static int[] reverse(int[] array) {
        final int[] arrayReverse = new int[array.length];
        for (int i = 0; i < arrayReverse.length; i++) {
            arrayReverse[i] = array[array.length - 1 - i];
        }
        return arrayReverse;
    }

    public static int[] findEvenElements(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] arrayEven = new int[count];
        for (int i = 0;i < arrayEven.length; i++) {
            for (int value : array) {
                if (value % 2 == 0) {
                    arrayEven[i] = value;
                }
            }
        }
        return arrayEven;
    }
}
