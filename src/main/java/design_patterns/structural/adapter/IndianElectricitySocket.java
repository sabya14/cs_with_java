package design_patterns.structural.adapter;

class IndianElectricitySocket {
    String giveElectricity(IndianElectricityPlug plug) {
        return plug.drawElectricity();
    }
}

