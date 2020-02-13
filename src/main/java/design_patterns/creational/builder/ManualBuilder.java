package design_patterns.creational.builder;

public class ManualBuilder implements Builder{

    private Manual manual;
    private String engine = "Some Default Engine Manual";
    private String gearBox = "Some Default GearBox Manual";
    private String tyres = "Some Default Tyres Manual";

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


    public Manual build() {
        this.manual = new Manual(this.engine, this.gearBox, this.gearBox);
        System.out.println("Built new manual");
        return this.manual;
    }
}
