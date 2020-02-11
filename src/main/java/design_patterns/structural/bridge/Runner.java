package design_patterns.structural.bridge;

public class Runner {

    public static void main(String[] args) {
        RedGlossyColor redGlossyColor = new RedGlossyColor(10);
        BoxShape boxShape = new BoxShape(redGlossyColor);
        System.out.println(boxShape.getColor());
        boxShape.setColorDensityForBoxShape(20);
    }
}
