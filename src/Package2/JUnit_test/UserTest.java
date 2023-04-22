package Package2.JUnit_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserTest {

    @Test
    void getAllUsers() {
        User user = new User("Евгений", 35, "MALE");
        User user1 = new User("Марина", 34, "FEMALE");
        User user2 = new User("Алина", 7, "FEMALE");

        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user);
//        actual.add(user1);
        actual.add(user2);

        Assertions.assertEquals(expected, actual);
    }
}