package design_patterns.bridge;


// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.

// ** Note this is not a abstract class, the term abstraction in the pattern definition does mean that.
// Here implementation is the Color class, which will maintain its own hierarchy.
// And the Shape class can then be extended for further additional functions.
public class Shape {

    private Color color;
    Shape(Color color) {
        this.color = color;
    }

    public String getColor() {
        return this.color.getColor();
    }
}
