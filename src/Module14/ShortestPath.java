package Module14;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);

        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        dist[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int i : g.get(node)) {
                if (dist[i] == -1) {
                    dist[i] = dist[node] + 1;
                    q.add(i);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}