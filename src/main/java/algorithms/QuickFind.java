package algorithms;

import java.util.stream.IntStream;

public class QuickFind {
    int[] id;

    public int[] getId() {
        return id;
    }

    public QuickFind(int n) {
        id = IntStream.range(0, n).toArray();
    }

    public String find(int start, int end) {
        return id[start] == id[end] ? "Connected" : "Not Connected";
    }

    public void union(int start, int end) {
        int current_connection = id[start];
        id[start] = id[end];
        for(int current_index = 0; current_index < id.length; current_index++) {
            if(id[current_index] == current_connection) {
                id[current_index] = id[end];
            }
        }
    }
}
