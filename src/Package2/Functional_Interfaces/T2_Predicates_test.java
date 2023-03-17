package Package2.Functional_Interfaces;

import java.util.function.Predicate;

public class T2_Predicates_test {
    public static void main(String[] args) {
        T2_MyPredicate myPredicate = i -> i > 10;
        System.out.println(myPredicate.test(20));
        System.out.println(myPredicate.test(0));

        Predicate<Integer> predicate = i -> i < 3;
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(3));
    }
}
