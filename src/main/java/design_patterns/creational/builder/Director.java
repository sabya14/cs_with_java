package design_patterns.creational.builder;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class Director {
    private Builder builder;

    Builder makeSportsCar() {
        System.out.println("Making with " + builder.getClass().getSimpleName());
        this.builder.setEngine("Sports Car");
        this.builder.setGearBox("Gear Box");
        this.builder.setTyres("Fast Tyres");
        return builder;
    };
    public Builder makeSUVCar() {
        this.builder.setEngine("SUV Car");
        this.builder.setGearBox("SUV Gear Box");
        this.builder.setTyres("SUV Fast Tyres");
        return builder;
    };

}
