package design_patterns.decorator;

public class Runner {


    public static void main(String[] args) {
        EmergencyMessage message = new EmergencyMessage("Send help");

        // Multiple decorators
        WhatsappNotifier whatsappNotifier = new WhatsappNotifier(new FaceBookNotifier(message));
        whatsappNotifier.sendMessage();
    }
}
