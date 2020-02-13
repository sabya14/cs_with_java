package design_patterns.creational.builder;


public class CarBuilder implements Builder{

    private Car car;
    private String engine = "Some Default Engine";
    private String gearBox = "Some Default GearBox";
    private String tyres = "Some Default Tyres";

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    @Override
    public void setTyres(String tyres) {
        this.tyres = tyres;
    }


    public Car build() {
        this.car = new Car(this.engine, this.gearBox, this.gearBox);
        System.out.println("Built new car");
        return this.car;
    }
}
