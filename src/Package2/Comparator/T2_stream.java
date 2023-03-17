package Package2.Comparator;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class T2_stream {
    public static void main(String[] args) {
        Supplier<Integer> rInt = () -> new Random().nextInt(1000);
        Stream.generate(rInt)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
