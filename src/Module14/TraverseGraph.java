package Module14;

import java.util.*;

public class TraverseGraph {
    static void bfs(ArrayList<ArrayList<Integer>> g, int start) {
        boolean[] visited = new boolean[g.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i : g.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 4; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(1).add(2);
        g.get(2).add(3);

        bfs(g, 0);
    }
}