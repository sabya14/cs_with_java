package design_patterns.structural.adapter;


public class Runner {

    public static void main(String[] args) {
        // Usage of adapter pattern
        IndianElectricitySocket indianElectricitySocket = new IndianElectricitySocket();
        EuElectricityPlug euElectricityPlug = new GermanPlug();
        EUToIndianPlugAdapter adapter = new EUToIndianPlugAdapter(euElectricityPlug);
        System.out.println(indianElectricitySocket.giveElectricity(adapter));
    }

}


