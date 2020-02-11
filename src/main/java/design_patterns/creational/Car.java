package design_patterns.creational;

import lombok.Getter;

@Getter
class Car {
    private String engine;
    private String gearBox;
    private String tyres;

    Car(String engine, String gearBox, String tyres) {
        this.engine = engine;
        this.gearBox = gearBox;
        this.tyres = tyres;
    }

}

