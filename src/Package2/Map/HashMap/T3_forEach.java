package Package2.Map.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class T3_forEach {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        for (Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

        System.out.println();

        passportsAndNames.entrySet().forEach(System.out::println);
    }
}
