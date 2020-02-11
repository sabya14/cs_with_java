package design_patterns.structural.adapter;

public class  EuElectricitySocket {
    private EuElectricityPlug plug;
    public String giveElectricity(EuElectricityPlug plug) {
        return plug.drawElectricity();

    }
}

