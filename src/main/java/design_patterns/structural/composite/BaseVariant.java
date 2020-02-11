package design_patterns.structural.composite;

public class BaseVariant implements Variant{

    private String name;
    private int stock;

    public BaseVariant(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return stock;
    }
}
