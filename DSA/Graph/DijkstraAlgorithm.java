package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgorithm {

    public static void main(String... args) {
        int V = 6;
        List<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dijksta(graph, V, 0);
    }

    private static class Edge {

        private int src;
        private int dest;
        private int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }
    private static void createGraph(List<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    private static class Pair implements Comparable<Pair> {

        private int node;
        private int dist;

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair that) {
            return this.dist - that.dist;
        }
    }

    private static void dijksta(List<Edge>[] graph, int V, int src) {

        Queue<Pair> pq = new PriorityQueue<Pair>();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        for(int i=0; i<V; i++) {
            if(i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()) {

            int current = pq.remove().node;

            if(!visited[current]) {
                visited[current] = true;

                for(int i=0; i<graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wt < dist[v]) {
                        dist[v] =  dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }
        }

        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " -> ");
        }
        System.out.println("END");
    }
}
