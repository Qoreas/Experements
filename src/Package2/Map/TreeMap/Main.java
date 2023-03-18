package Package2.Map.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Person, Integer> map = new TreeMap<>(Comparator.comparing(o -> o.age));
        map.put(new Person("John", "Smith", 17), 0);
        map.put(new Person("Ivan", "Petrenko", 65), 0);
        map.put(new Person("Pedro", "Escobar", 32), 0);
        map.put(new Person("Radion", "Pyatkin", 14), 0);
        map.put(new Person("Sergey", "Vashkevich", 19), 0);

        Person firstAdultPerson = map.navigableKeySet().stream()
                .filter(person -> person.age > 18).findFirst().get();

        Map<Person, Integer> youngPeopleMap = map.headMap(firstAdultPerson, false);
        Map<Person, Integer> adultPeopleMap = map.tailMap(firstAdultPerson, false);

        System.out.println(youngPeopleMap);
        System.out.println(adultPeopleMap);

    }
}
