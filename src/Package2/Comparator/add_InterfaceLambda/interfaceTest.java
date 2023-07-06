package Package2.Comparator.add_InterfaceLambda;

public class interfaceTest {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        myInterface.print();

        MyInterface interface1 = () -> System.out.println("Hello");
        MyInter2 interface2 = (String str) -> System.out.println(str);
        interface2.print("he");
    }
}
