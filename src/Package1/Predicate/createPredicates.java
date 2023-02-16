package Package1.Predicate;

import java.util.function.Predicate;

public class createPredicates {
    public static void main(String[] args) {
        Predicate<String> strPr = s -> s.isEmpty();
        System.out.println(strPr.test("Hi"));
        System.out.println(strPr.test(null));

        Predicate<String> stringPredicate = new Predicate<>() {
            @Override
            public boolean test(String s) {
                return s != null;
            }
        };

        System.out.println(stringPredicate.test("Nu"));
        System.out.println(stringPredicate.test(null));
    }
}
