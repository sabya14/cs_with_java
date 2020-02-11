package design_patterns.structural.proxy;

public class Runner {

    public static void main(String[] args) {
        Image image = new ProxyImage("random.jpg");
        image.display();

        image.display();
    }
}
