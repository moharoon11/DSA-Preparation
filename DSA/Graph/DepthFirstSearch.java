package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {

    public static void main(String... args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);


        System.out.println();

        boolean[] visited = new boolean[v];

        for(int i=0; i<v; i++) {
            if(!visited[i])
                dfs(graph, i, visited);
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
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6,5));
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

    private static void dfs(ArrayList<Edge>[] graph, int current, boolean[] visited) {
            System.out.print(current + " ");
            visited[current] = true;

            for(int i=0; i<graph[current].size(); i++) {
                Edge e = graph[current].get(i);
                if(!visited[e.dest])
                    dfs(graph,e.dest, visited);
            }
    }

   }
