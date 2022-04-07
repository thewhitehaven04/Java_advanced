package Exercise3_1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author German Bulavkin
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 */

public class ArraySwap {

    /**
     * Find the highest integer in the array.
     *
     * @param arr an array of ints;
     * @return the array's highest integer.
     */
    private static int findIntMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }

        return max;
    }

    /**
     * Find the lowest integer of the array.
     *
     * @param arr an array of ints;
     * @return the array's lowest integer.
     */
    private static int findIntMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min)
                min = value;
        }

        return min;
    }

    private static int getIndexOfValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int DEFAULT_ARRAY_DIMENSION = 20;
        int LOWER_BOUND = -10;
        int UPPER_BOUND = 10;
        int[] arr;

        Random random = new Random();
        arr = random.ints(DEFAULT_ARRAY_DIMENSION, LOWER_BOUND, UPPER_BOUND + 1).toArray();
        int[] positives = Arrays.stream(arr).filter(number -> number >= 0).toArray();
        int[] negatives = Arrays.stream(arr).filter(number -> number < 0).toArray();

        int lowestPositive = ArraySwap.findIntMin(positives);
        int highestNegative = ArraySwap.findIntMax(negatives);

        System.out.printf("Highest negative value of the array: %d\n", highestNegative);
        System.out.printf("Lowest positive value of the array: %d\n", lowestPositive);

        // store indices of the values to swap
        int lowestPositiveIndex = ArraySwap.getIndexOfValue(arr, lowestPositive);
        int highestNegativeIndex = ArraySwap.getIndexOfValue(arr, highestNegative);

        System.out.println("Array before the swap: " + Arrays.toString(arr));

        arr[lowestPositiveIndex] = highestNegative;
        arr[highestNegativeIndex] = lowestPositive;

        System.out.println("Array after the swap: " + Arrays.toString(arr));
    }
}
