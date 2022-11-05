public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 13;
        int noEdges = 13;
        Graph Graph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        Graph.edge[0].src = "Marianne";
        Graph.edge[0].dest = "Winny";
    
        // Edge 2
        Graph.edge[1].src = "Marianne";
        Graph.edge[1].dest = "Jap";

        // Edge 3
        Graph.edge[2].src = "Marianne";
        Graph.edge[2].dest = "Angelo";

        Graph.edge[3].src = "Marianne";
        Graph.edge[3].dest = "Tristan";

        // Edge 4
        Graph.edge[4].src = "Marianne";
        Graph.edge[4].dest = "Luis";

        // Edge 5
        Graph.edge[5].src = "Marianne";
        Graph.edge[5].dest = "Jaime";

        // Edge 6
        Graph.edge[6].src = "Marianne";
        Graph.edge[6].dest = "Florence";

        Graph.edge[7].src = "Marianne";
        Graph.edge[7].dest = "Joshua";

        // Edge 7
        Graph.edge[8].src = "Marianne";
        Graph.edge[8].dest = "Richael";

        // Edge 8
        Graph.edge[9].src = "Marianne";
        Graph.edge[9].dest = "Andrei";

        //Edge 9
        Graph.edge[10].src = "Winny";
        Graph.edge[10].dest = "Luis";

        //Edge 10
        Graph.edge[11].src = "Tristan";
        Graph.edge[11].dest = "Jap";

        //Edge 11
        Graph.edge[12].src = "Andrei";
        Graph.edge[12].dest = "Shiela";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(Graph.edge[i].src + " - " + Graph.edge[i].dest);
        }

    }
}
