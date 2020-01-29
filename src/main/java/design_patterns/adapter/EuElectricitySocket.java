package design_patterns.adapter;

public class  EuElectricitySocket {
    private EuElectricityPlug plug;
    public String giveElectricity(EuElectricityPlug plug) {
        return plug.drawElectricity();

    }
}

