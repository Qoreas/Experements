package Package1.StreamAPI.addition2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4443);
        list.add(4242);
        list.add(132331);
        list.add(5379355);
        list.add(445523);
        list.add(44222);
        list.add(-9999);


        Stream<Integer> stream = list.stream();
        stream.filter(x -> x < 5000).forEach(System.out::println);
    }
}
