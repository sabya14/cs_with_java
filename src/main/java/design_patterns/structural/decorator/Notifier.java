package design_patterns.structural.decorator;

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
