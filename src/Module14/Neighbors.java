package Module14;

import java.util.*;

public class Neighbors {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 3; i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);

        System.out.println("Neighbors of 0: " + g.get(0));
    }
}