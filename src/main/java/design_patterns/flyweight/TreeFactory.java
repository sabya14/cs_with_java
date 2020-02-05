package design_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class TreeFactory {
    private static List<TreeType> flyweights = new ArrayList<TreeType>() {};

    static TreeType getTreeType(String texture, String color) {
        Optional<TreeType> treeType = flyweights.stream().filter(x -> x.texture.equals(texture) && x.color.equals(color)).findAny();
        if (treeType.isPresent()) {
            System.out.println("Using existing tree type");
            return treeType.get();
        } else {
            System.out.println("Creating new tree type");
            TreeType treeTypeNew = new TreeType(texture, color);
            flyweights.add(treeTypeNew);
            return treeTypeNew;
        }
    }
}
