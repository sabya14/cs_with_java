package design_patterns.structural.composite;

import java.util.List;

public class SubVariant implements Variant{

    private List<Variant> variants;
    private String name;
    public SubVariant(String name, List<Variant> variants) {
        this.variants = variants;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return this.variants.stream().map(Variant::getStock).mapToInt(Integer::intValue).sum();

    }
}
