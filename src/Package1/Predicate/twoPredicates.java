package Package1.Predicate;

import java.util.function.Predicate;

public class twoPredicates {
    public static void main(String[] args) {
        Predicate<String> strPred_1 = str -> str.contains("A");
        Predicate<String> strPred_2 = str -> str.contains("B");

        System.out.println(strPred_1.and(strPred_2).test("ABC"));
        System.out.println(strPred_1.and(strPred_2).test("AC"));

        System.out.println(strPred_1.or(strPred_2).test("BC"));
    }
}
