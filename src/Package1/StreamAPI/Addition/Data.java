package Package1.StreamAPI.Addition;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("John", "Smith", 17));
        persons.add(new Person("Ivan", "Petrenko", 65));
        persons.add(new Person("Pedro", "Escobar", 32));
        persons.add(new Person("Radion", "Pyatkin", 14));
        persons.add(new Person("Sergey", "Vashkevich", 33));
    }

    public static List<Person> getPersons() {
        return persons;
    }
}
