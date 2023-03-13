package Package1.StreamAPI;

import java.util.List;
import java.util.stream.Stream;

public class T3_collect {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 5344, 4, 6, 7, 32, 8, 5, 23).toList();
        System.out.println(list);
    }
}
