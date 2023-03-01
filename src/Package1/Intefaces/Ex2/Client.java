package Package1.Intefaces.Ex2;

import Package1.Intefaces.Ex2.Messengers.Messenger;
import Package1.Intefaces.Ex2.Messengers.Telegram;

public class Client {
    private Messenger messenger;

    public Client(Messenger messenger) {
        this.messenger = new Telegram();
    }
}

