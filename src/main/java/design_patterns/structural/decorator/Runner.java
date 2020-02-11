package design_patterns.structural.decorator;

public class Runner {


    public static void main(String[] args) {
        EmergencyMessage message = new EmergencyMessage("Send help");

        // Multiple decorators
        WhatsappNotifier whatsappNotifier = new WhatsappNotifier(new FaceBookNotifier(message));
        whatsappNotifier.sendMessage();
    }
}
