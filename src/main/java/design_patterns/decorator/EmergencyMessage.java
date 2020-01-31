package design_patterns.decorator;

public class EmergencyMessage implements Message{

    private String message;

    EmergencyMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending important Message");
        System.out.println(message);
    }
}
