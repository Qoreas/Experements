package Package1.Sorts;

import java.util.Arrays;

public class ChoiceSort_s3 {
    public static void main(String[] args) {
        int[] array = CreateRandomArray.Int(1, 100, 10);

        System.out.println(Arrays.toString(sortByMin(array)));
    }

    private static int[] sortByMin(int[] array) {

        for (int step = 0; step < array.length; step++) {
            int index = findMin(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        return array;
    }

    private static int findMin(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minIndex = i;
                minValue = array[i];
            }
        }

        return minIndex;
    }
}
