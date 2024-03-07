package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String... args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        bfs(graph, v);

        System.out.println();

        boolean[] visited = new boolean[v];
        for(int i=0; i<v; i++) {
            if(visited[i] == false) {
                bfsDisconnectedGraph(graph, v, visited, i);
            }
        }

    }

    private static class Edge {

        private int src;
        private int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }



    private static void createGraph(ArrayList<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 6));
        /*
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
         **/
    }

    private static void bfs(ArrayList<Edge>[] graph, int v) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);

        boolean[] visited = new boolean[v];

        while(!queue.isEmpty()) {
            int current = queue.remove();

            if(visited[current] == false) {
                System.out.print(current + " -> ");
                visited[current] =  true;
                for(int i=0; i< graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    queue.add(e.dest);
                }
            }

        }
    }

    // This is the better approach this will work perfectly for both normal graph and disconnected graph
    private static void bfsDisconnectedGraph(ArrayList<Edge>[] graph, int v, boolean[] visited, int start) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);


        while (!queue.isEmpty()) {
            int current = queue.remove();

            if (visited[current] == false) {
                System.out.print(current + " -> ");
                visited[current] = true;
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }


}
