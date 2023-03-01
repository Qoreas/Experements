package Package1.Intefaces.Ex2.Messengers;

public class Telegram implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Telegram sent a message");
    }

    @Override
    public void getMessage() {
        System.out.println("Telegram got a message");
    }
}
