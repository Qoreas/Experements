package Package3.Stack_Queue;

import org.junit.jupiter.api.Test;

class SimpleStackTest {
    @Test
    void print() {
        SimpleStack<Integer> list = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            list.push(i);
        }
        System.out.println();

        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }
    }
}