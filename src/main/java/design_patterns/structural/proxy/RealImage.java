package design_patterns.structural.proxy;

public class RealImage implements Image{
    private String fileName;


    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying real Image");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading from disk");
    }
}
