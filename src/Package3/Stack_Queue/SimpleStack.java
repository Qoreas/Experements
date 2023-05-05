package Package3.Stack_Queue;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T t) {
        list.add(0, t);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}