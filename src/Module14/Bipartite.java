package Module14;

import java.util.*;

public class Bipartite {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(1).add(2);
        g.get(2).add(3);

        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int i : g.get(node)) {
                if (color[i] == -1) {
                    color[i] = 1 - color[node];
                    q.add(i);
                } else if (color[i] == color[node]) {
                    System.out.println("Not Bipartite");
                    return;
                }
            }
        }

        System.out.println("Bipartite");
    }
}