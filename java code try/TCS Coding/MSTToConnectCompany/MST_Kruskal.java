import java.util.*;

class Edge {
    int u, v, cost;

    Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }
}

public class MST_Kruskal {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        parent[find(x)] = find(y);
    }

    public static void main(String[] args) {

        int n = 4;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1,2,1));
        edges.add(new Edge(1,3,4));
        edges.add(new Edge(2,3,2));
        edges.add(new Edge(2,4,5));
        edges.add(new Edge(3,4,3));

        // Sort by cost
        edges.sort((a, b) -> a.cost - b.cost);

        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        int totalCost = 0;

        for (Edge e : edges) {

            if (find(e.u) != find(e.v)) {
                totalCost += e.cost;
                union(e.u, e.v);
            }
        }

        System.out.println(totalCost);
    }
}