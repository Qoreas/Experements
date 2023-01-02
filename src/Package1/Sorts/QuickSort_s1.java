package Package1.Sorts;

import java.util.Arrays;

public class QuickSort_s1 {
    public static void main(String[] args) {
        int[] array = CreateRandomArray.Int(1, 100, 10);

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int average = partition(array, start, end);

            quickSort(array, start, average - 1);
            quickSort(array, average, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;

        int average = array[(start + end) / 2];
        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < average) {
                leftIndex++;
            }

            while (array[rightIndex] > average) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
