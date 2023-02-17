package Package1.Predicate;

import java.util.function.Predicate;

public class T2 {
    public static void main(String[] args) {
        Predicate<String> strPr1 = s -> s.startsWith("J");
        Predicate<String> strPr2 = s -> s.startsWith("N");
        Predicate<String> strPr3 = s -> s.endsWith("A");

        Predicate<String> result = strPr1.or(strPr2).and(strPr3);

        Predicate<String> allIn = s -> s.startsWith("J") || s.startsWith("N") && s.endsWith("A");

        System.out.println(result.test("JoA"));
        System.out.println(result.test("No"));
        System.out.println(result.test("NoA"));

    }
}
