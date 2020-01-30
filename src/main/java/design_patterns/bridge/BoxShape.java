package design_patterns.bridge;

public class BoxShape extends Shape {

    private Color color;
    BoxShape(Color color) {
        super(color);
        this.color = color;
    }

    public String getColor() {
        return this.color.getColor();
    }

    void setColorDensityForBoxShape(int density) {
        this.color.setDensity(density);
    }
}
