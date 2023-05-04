package Package3.Stack_Queue;

import org.junit.jupiter.api.Test;

class SimpleQueueTest {
    @Test
    void print() {
        SimpleQueue<Integer> simpleStack = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
            simpleStack.add(i);
        }
        System.out.println();
        while (!simpleStack.isEmpty()) {
            System.out.print(simpleStack.remove());
        }
    }
}