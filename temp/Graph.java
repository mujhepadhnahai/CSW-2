import java.util.*;

public class Graph<T> {
    private LinkedList<T>[] adjList;
    private int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, T dest) {
        if (src >= 0 && src < vertices) {
            adjList[src].add(dest);
        } else {
            throw new IndexOutOfBoundsException("Vertex index out of bounds");
        }
    }

    void printAdjList() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (T vertex : adjList[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (T neighbor : adjList[vertex]) {
           
            if (neighbor instanceof Integer) {
                int neighborIndex = (Integer) neighbor;
                if (!visited[neighborIndex]) {
                    DFSUtil(neighborIndex, visited);
                }
            } else {
                System.out.println("Warning: DFS for non-integer vertices requires a mapping to indices.");
                return; 
            }
        }
    }

    public static void main(String[] args) {
        Graph<Integer> graphInt = new Graph<>(4);
        graphInt.addEdge(0, 1);
        graphInt.addEdge(0, 2);
        graphInt.addEdge(1, 2);
        graphInt.addEdge(2, 0);
        graphInt.addEdge(2, 3);
        graphInt.addEdge(3, 3);
        System.out.println("Adjacency List for Integer Graph:");
        graphInt.printAdjList();

        System.out.println("\nDFS starting from vertex 2:");
        graphInt.DFS(2);
        System.out.println();

        System.out.println();

        Graph<String> graphString = new Graph<>(3);
        graphString.addEdge(0, "A");
        graphString.addEdge(0, "B");
        graphString.addEdge(1, "C");
        graphString.addEdge(2, "A");
        System.out.println("Adjacency List for String Graph:");
        graphString.printAdjList();

        System.out.println("\nDFS starting from vertex 0 (for String graph - assuming implicit index):");
       
        if (graphString.vertices > 0) {
            System.out.println("Cannot perform direct DFS on String graph without a vertex-to-index mapping.");
        }
    }
}