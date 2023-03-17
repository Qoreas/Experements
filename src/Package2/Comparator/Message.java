package Package2.Comparator;

import java.util.*;

public class Message {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }

    public String getMessage() {
        return message;
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return "<" + id + "> " + message;
    }

    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello Syu."));
        messages.add(new Message("Hello Kaly."));
        System.out.println(messages);

        Comparator<Message> comparator = Comparator.comparing(Message::getId);
//        comparator.thenComparing(o -> o.getMessage().length());

        messages.sort(comparator);
        System.out.println("After sort - " + messages);


    }
}
