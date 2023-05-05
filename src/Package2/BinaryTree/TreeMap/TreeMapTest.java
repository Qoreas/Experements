package Package2.BinaryTree.TreeMap;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

class TreeMapTest {
    @Tag("Create map")
    TreeMap<Integer, String> createTreeMap() {
        TreeMap<Integer, String> map = new TreeMap<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(20); i++) {
            map.put(random.nextInt(-100, 100), createString(random.nextInt(10)));
        }
        System.out.println("Size=" + map.size());
        return map;
    }

    @Tag("Create string")
    String createString(int length) {
        int leftLimit = 97;
        int rightLimit = 122;
        Random r = new Random();
        StringBuilder strb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (r.nextFloat() * (rightLimit - leftLimit + 1));
            strb.append((char) randomLimitedInt);
        }
        return strb.toString();
    }

    @Test
    void put() {
    }

    @Test
    void printValuesNaturalOrder() {
        TreeMap<Integer, String> map = createTreeMap();
        map.printValuesNaturalOrder(map.root());
    }

    @Test
    void printKeysNaturalOrder() {
        TreeMap<Integer, String> map = createTreeMap();
        map.printKeysNaturalOrder(map.root());
    }
}