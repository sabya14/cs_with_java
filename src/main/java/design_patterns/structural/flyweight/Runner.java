package design_patterns.structural.flyweight;

public class Runner {
    public static void main(String[] args) {
        Tree tree1 = new Tree(1,2, "fine", "brown");
        Tree tree2= new Tree(1,2, "coarse", "brown");
        Tree tree3 = new Tree(1,2, "fine", "brown");
        Tree tree4 = new Tree(1,2, "coarse", "brown");
    }
}
