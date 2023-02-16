package Package1.Predicate;

import java.util.function.Predicate;

public class T1 {
    public static void main(String[] args) {
        Predicate<Integer> negative = (Integer integer) -> integer <= 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(10));
        System.out.println(negative.test(0));
    }
}
