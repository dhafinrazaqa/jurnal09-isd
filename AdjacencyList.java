import java.util.LinkedList;

public class AdjacencyList {
    int vertices;
    LinkedList<Integer> adjListArray[];

    public AdjacencyList(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjListArray[source].add(destination);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + numToAlphabet(i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(numToAlphabet(adjListArray[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public String numToAlphabet(int num) {
        switch (num) {
            case 0: return "A";
            case 1: return "B";
            case 2: return "C";
            case 3: return "D";
            case 4: return "E";
            case 5: return "F";
            case 6: return "G";
            case 7: return "H";
            case 8: return "I";
        }
        return null;
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(9);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(2, 1);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(5, 2);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 5);

        graph.printGraph();
    }
}