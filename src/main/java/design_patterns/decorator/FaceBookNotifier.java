package design_patterns.decorator;

public class FaceBookNotifier extends Notifier{

    private Message message;
    FaceBookNotifier(Message message) {
        super(message);
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("Send notification to facebook");
        this.message.sendMessage();
    }

}
