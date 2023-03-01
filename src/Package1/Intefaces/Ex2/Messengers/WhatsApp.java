package Package1.Intefaces.Ex2.Messengers;

public class WhatsApp implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("WhatsApp sent a message");
    }

    @Override
    public void getMessage() {
        System.out.println("WhatsApp got a message");
    }
}
