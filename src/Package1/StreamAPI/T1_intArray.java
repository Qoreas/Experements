package Package1.StreamAPI;

import java.util.stream.IntStream;

public class T1_intArray {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 110, 2221).
                filter(x -> x > 10).
                map(operand -> operand + 10).
                limit(3).
                forEach(System.out::println);
    }
}