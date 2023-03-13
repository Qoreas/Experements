package Package1.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class T2_arrayStream_split {
    public static void main(String[] args) {
        String[] array = {"He  l lo", "j av a", "j av a"};
        Stream<String> stream = Arrays.stream(array);

        stream.map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .distinct() // delete duplicates
                .toList()
                .forEach(System.out::print);

    }
}
