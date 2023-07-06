package Package2.Comparator.add_InterfaceLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
    public static void main(String[] args) {
        int[] ar1 = createRandomArray(5);
        int[] ar2 = createRandomArray(3);
        int[] ar3 = createRandomArray(8);

        List<int[]> list = new ArrayList<>();
        list.add(ar1);
        list.add(ar2);
        list.add(ar3);

        Comparator<int[]> sortByLength = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1.length - o2.length;
            }
        };

        Comparator<int[]> sortByLength2 = (o1, o2) -> o1.length - o2.length;

        list.sort(sortByLength);
        for (int[] i : list) {
            System.out.println(Arrays.toString(i) + "; ");
        }
    }

    private static int[] createRandomArray(int i) {
        int[] arr = new int[i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
