package Package1.Abstracts;

public class Sedan extends Car{
    @Override
    public void gas() {
        System.out.println("Sedan is driving");
    }

    @Override
    public void brake() {
        System.out.println("Sedan is breaking");
    }
}
