package Package1.Intefaces.Ex1;

public class Duck implements Swimmable {
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.eat();
    }
}
