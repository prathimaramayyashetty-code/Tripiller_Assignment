package Module14;

import java.util.*;

public class CycleDetection {
    static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> g) {
        visited[node] = true;

        for (int i : g.get(node)) {
            if (!visited[i]) {
                if (dfs(i, node, visited, g)) return true;
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 3; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(1).add(0);
        g.get(1).add(2);
        g.get(2).add(1);

        System.out.println(dfs(0, -1, new boolean[3], g));
    }
}