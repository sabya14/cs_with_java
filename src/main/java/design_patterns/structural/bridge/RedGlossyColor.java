package design_patterns.structural.bridge;

public class RedGlossyColor implements Color
{

    private int density;
    RedGlossyColor(int density) {
        this.density = density;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getType() {
        return "Glossy";
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
