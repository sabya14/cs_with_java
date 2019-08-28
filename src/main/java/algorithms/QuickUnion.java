package algorithms;

import java.util.stream.IntStream;

public class QuickUnion {
    int[] ids;

    public int[] getIds() {
        return ids;
    }

    public QuickUnion(int n) {
        ids = IntStream.range(0, n).toArray();
    }

    public String find(int start, int end) {
        return root(start) == root(end) ? "Connected": "Not Connected";
    }

    public int root(int index) {
        while (index != ids[index]) {
            ids[index] = ids[ids[index]];
            index = ids[index];
        }
        return index;
    }
    public void union(int start, int end) {
        int root_start = root(start);
        int end_root = root(end);
        ids[root_start] = end_root;
    }
}

