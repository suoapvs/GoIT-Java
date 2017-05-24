package ua.goit.java.lesson06.task05;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class HW2 {

    public static void main(String[] args) {
        final int length = 10;
        int[] array = createRandomArray(length);

        System.out.println(Arrays.toString(array));
        System.out.println(ArraysUtils.sum(array));
        System.out.println(ArraysUtils.min(array));
        System.out.println(ArraysUtils.max(array));
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println(ArraysUtils.modulus(array));
        System.out.println(ArraysUtils.secondLargest(array));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array)));
    }

    private static int[] createRandomArray(final int length) {
        final int[] array = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
