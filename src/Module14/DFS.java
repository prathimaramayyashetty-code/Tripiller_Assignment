package Module14;

import java.util.*;

public class DFS {
    static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i : graph.get(node)) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 4; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);

        dfs(g, 0, new boolean[4]);
    }
}