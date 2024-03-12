package Graph;

import java.util.ArrayList;

public class DirectedGraphCycleDetection {

    public static void main(String... args) {

        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println(hasCycle(graph));
    }

    private static class Edge {

        private int src;
        private int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }


    private static boolean hasCycle(ArrayList<Edge>[] graph) {

        int v = graph.length;
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];

        for(int i=0; i<v; i++) {
            if(!visited[i]) {
                if(dfs(graph, i, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(ArrayList<Edge>[] graph, int current, boolean[] visited, boolean[] recStack) {

        visited[current] = true;
        recStack[current] = true;

        for(Edge e: graph[current]) {
            if(!visited[e.dest]) {
                if(dfs(graph, e.dest, visited, recStack))
                    return true;
            }
            else if(recStack[e.dest]) {
                return true;
            }
        }

        recStack[current] = false;
        return false;
    }

    private static void createGraph(ArrayList<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

}
