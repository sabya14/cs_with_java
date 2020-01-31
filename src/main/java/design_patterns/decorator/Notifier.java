package design_patterns.decorator;

public class Notifier implements Message {

    private Message message;

    Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        message.sendMessage();
    }
}
