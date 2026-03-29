package Module14;
import java.util.*;

public class ConnectedComponents {
    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> g) {
        visited[node] = true;
        for (int i : g.get(node)) {
            if (!visited[i])
                dfs(i, visited, g);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(3).add(4);

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, g);
                count++;
            }
        }

        System.out.println("Components: " + count);
    }
}