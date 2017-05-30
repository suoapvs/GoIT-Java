package ua.goit.java.lesson06.task03;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class HW2 {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = createRandomArray(length);

        final ArraysUtils arraysUtils = new ArraysUtils();
        System.out.println(Arrays.toString(array));
        System.out.println(arraysUtils.sum(array));
        System.out.println(arraysUtils.min(array));
        System.out.println(arraysUtils.max(array));
        System.out.println(arraysUtils.maxPositive(array));
        System.out.println(arraysUtils.multiplication(array));
        System.out.println(arraysUtils.modulus(array));
        System.out.println(arraysUtils.secondLargest(array));
        System.out.println(Arrays.toString(arraysUtils.reverse(array)));
        System.out.println(Arrays.toString(arraysUtils.findEvenElements(array)));
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
