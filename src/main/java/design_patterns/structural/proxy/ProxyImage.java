package design_patterns.structural.proxy;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = null;
    }

    @Override
    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(fileName);
            realImage.display();
        }
        else {
            System.out.println("Not loading from disk");
            realImage.display();
        }

    }


}
