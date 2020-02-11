package design_patterns.structural.facade;

public class Mp4VideoConvertor implements VideoConvertor{

    @Override
    public void convert() {
        System.out.println("Converting video by the following steps");
    }
}
