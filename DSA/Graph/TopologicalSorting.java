package Graph;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    public static void main(String... args) {

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        topSortUtil(graph, v);

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

       graph[2].add(new Edge(2,3));

       graph[3].add(new Edge(3,1));

       graph[4].add(new Edge(4,0));
       graph[4].add(new Edge(4,1));

       graph[5].add(new Edge(5,0));
       graph[5].add(new Edge(5,2));
    }

    private static void topSortUtil(ArrayList<Edge>[] graph, int v) {

        boolean[] visited =  new boolean[v];
        Stack<Integer> stack = new Stack();
        for(int i=0; i<v; i++) {
            if(!visited[i]) {
                topologicalSorting(graph, i, visited, stack);
            }
        }


        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }


    }

    private static void topologicalSorting(ArrayList<Edge>[] graph, int current, boolean[] visited, Stack<Integer> stack) {

        visited[current] = true;

        for(int i=0; i<graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!visited[e.dest]) {
                topologicalSorting(graph, e.dest, visited, stack);
            }
        }

        stack.push(current);
    }
}
