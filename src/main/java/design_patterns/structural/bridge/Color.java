package design_patterns.structural.bridge;

// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.

public interface Color {
    String getColor();
    String getType();
    void setDensity(int density);
}
