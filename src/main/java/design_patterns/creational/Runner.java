package design_patterns.creational;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.setBuilder(carBuilder);
        director.makeSportsCar();
        Car sportsCar = carBuilder.build();
        ManualBuilder manualBuilder = new ManualBuilder();
        director.setBuilder(manualBuilder);
        director.makeSportsCar();
        Manual manual = manualBuilder.build();

    }
}
