package design_patterns.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeType {
    protected String texture;
    protected String color;

    void draw(int x, int y) {
        System.out.println("Drawing on point " + x + " " + y);
    }
}
