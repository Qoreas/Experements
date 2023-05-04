package Package3.Stack_Queue;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
