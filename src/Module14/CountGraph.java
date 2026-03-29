package Module14;

import java.util.*;

public class CountGraph {
    public static void main(String[] args) {
        int V = 3;
        int edges = 0;

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(1).add(2);

        for (int i = 0; i < V; i++)
            edges += g.get(i).size();

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges);
    }
}