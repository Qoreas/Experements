package Package1.StreamAPI.Addition;

import java.util.List;

public class T1 {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .filter(p -> p.getAge() > 20)
                .toList();

        persons2.forEach(System.out::println);

//        Optional<Person> person = persons.stream()
//                .filter(p -> p.getAge() > 30)
//                .findAny();
//
//        System.out.println(person.get());

    }
}
