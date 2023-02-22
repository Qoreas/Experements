package Package1.HashMap;

import java.util.HashMap;

public class passesForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 10);
        map.put("apple", 3);
        map.put("berry", 21);
        map.put("orange", 48);

        map.forEach((s, integer) -> System.out.println(integer < 20));
    }
}
