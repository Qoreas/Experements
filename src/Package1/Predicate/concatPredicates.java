package Package1.Predicate;

import java.util.function.Predicate;

public class concatPredicates {
    public static void main(String[] args) {
        Predicate<String> strPr1 = str -> str.contains("A");
        Predicate<String> strPr2 = str -> str.contains("B");

        Predicate<String> strPr3 = strPr1.and(strPr2);
        System.out.println(strPr3.test("ABC"));
    }
}
