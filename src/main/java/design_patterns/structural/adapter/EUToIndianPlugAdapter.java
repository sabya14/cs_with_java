package design_patterns.structural.adapter;

public class EUToIndianPlugAdapter implements IndianElectricityPlug {

    EuElectricityPlug euElectricityPlug;

    public EUToIndianPlugAdapter(EuElectricityPlug euElectricityPlug) {
        this.euElectricityPlug = euElectricityPlug;
    }

    @Override
    public String drawElectricity() {
        return this.euElectricityPlug.drawElectricity();
    }
}
