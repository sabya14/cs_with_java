package design_patterns.adapter;

class IndianElectricitySocket {
    String giveElectricity(IndianElectricityPlug plug) {
        return plug.drawElectricity();
    }
}

