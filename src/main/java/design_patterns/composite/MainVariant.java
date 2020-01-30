package design_patterns.composite;

import java.util.List;

public class MainVariant implements Variant{

    private List<SubVariant> subVariants;
    private String name;
    public MainVariant(String name, List<SubVariant> subVariants) {
        this.subVariants = subVariants;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return this.subVariants.stream().map(SubVariant::getStock).mapToInt(Integer::intValue).sum();

    }
}
