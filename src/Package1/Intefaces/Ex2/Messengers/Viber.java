package Package1.Intefaces.Ex2.Messengers;

public class Viber implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Viber sent a message");
    }

    @Override
    public void getMessage() {
        System.out.println("Viber got a message");
    }
}
