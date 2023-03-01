package Package1.DifferenceAbstarct_Interface;

public class Mockingjay extends Bird{
    @Override
    public void fly() {
        System.out.println("Mockingjay is flying");
    }

    public static void main(String[] args) {
        Mockingjay mockingjay = new Mockingjay();
        mockingjay.setAge(20);
        System.out.println(mockingjay.getAge());
    }
}
