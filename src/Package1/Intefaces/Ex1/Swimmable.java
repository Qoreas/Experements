package Package1.Intefaces.Ex1;

public interface Swimmable {

    default void swim() {
        System.out.println("Animal can swim!");
    }

    void eat();

}
