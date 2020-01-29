package design_patterns.adapter;

public class IndianElectricitySocket {
    public String giveElectricity(EuElectricityPlug plug) {
        return plug.drawElectricity();

    }
}

