package Package1.Sorts;

import java.util.Arrays;
import java.util.Random;

public class CreateRandomArray {
    public static int[] Int(int start, int end, int capacity) {
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(start, end);
        }

        System.out.println(Arrays.toString(array));
        return array;
    }
}
