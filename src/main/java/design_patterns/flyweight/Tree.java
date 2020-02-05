package design_patterns.flyweight;

public class Tree {

    private int x;
    private int y;
    private TreeType type;

    Tree(int x, int y, String texture, String color) {
        this.x = x;
        this.y = y;
        this.type = TreeFactory.getTreeType(texture, color);
    }

    public void plantTree(){
        this.type.draw(this.x, this.y);
    }
}
