package design_patterns.structural.adapter;

public class GermanPlug implements EuElectricityPlug {
    @Override
    public String drawElectricity() {
        return ("Using german plug to draw current");
    }
}
