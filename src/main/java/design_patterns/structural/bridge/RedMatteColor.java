package design_patterns.structural.bridge;

public class RedMatteColor implements Color
{

    private int density;

    public RedMatteColor(int density) {
        this.density = density;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getType() {
        return "Matte";
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
