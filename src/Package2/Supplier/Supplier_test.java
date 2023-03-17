package Package2.Supplier;

import java.util.function.Supplier;

public class Supplier_test {
    public static void main(String[] args) {
        String msg = "fhbweb";
        Supplier<String> supplier = msg::toUpperCase;
        System.out.println(supplier.get());
    }
}
