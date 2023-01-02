package Package1.Sorts;

import java.util.Arrays;

public class BubbleSort_s2 {
    public static void main(String[] args) {
        int[] array = CreateRandomArray.Int(1, 100, 10);

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}