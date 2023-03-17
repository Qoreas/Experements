package Package2.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomInt {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(10);
        System.out.println(supplier.get());
    }
}
