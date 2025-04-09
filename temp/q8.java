/*
Implement a Java program to traverse a graph using Breadth-First Search (BFS) with 13.4 an adjacency list. Use ArrayDeque for efficient traversal. The program should include a methods to initialize the graph, add edges, display the adjacency list, and perform BFS. Finally, use the main method to construct the graph, invoke BFS, and display the traversal output.
Graph Class:
 */
import java.util.*;
class Graph {
    private LinkedList<Integer>[] adjList;
    private int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        if (src >= 0 && src < vertices && dest >= 0 && dest < vertices) {
            adjList[src].add(dest);
            adjList[dest].add(src);
        } else {
            throw new IndexOutOfBoundsException("Vertex index out of bounds");
        }
    }
    void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Integer neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
           System.out.println();
        }
    }
    void BFS(int startVertex) {
        if (startVertex < 0 || startVertex >= vertices) {
            System.out.println("Invalid start vertex.");
            return;
        }

        boolean[] visited = new boolean[vertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        System.out.println("\nBreadth-First Search starting from vertex " + startVertex + ":");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (Integer neighbor : adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,5);
        graph.addEdge(3,4);

        graph.printAdjList();
        graph.BFS(0);
   
        
        

    }
}