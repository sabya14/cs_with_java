package design_patterns.decorator;

public class WhatsappNotifier extends Notifier{

    private Message message;
    WhatsappNotifier(Message message) {
        super(message);
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("Send notification to Whatsapp");
        this.message.sendMessage();
    }

}
