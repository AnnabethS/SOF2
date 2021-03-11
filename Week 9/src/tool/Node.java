import java.util.ArrayList;

public class Node {
    protected String name;
    private ArrayList<Edge> edges;
    private int degree;

    public Node(String name)
    {
        this.name = name;
        degree = 0;
    }

    public void addEdge(Node otherNode, int weight)
    {
        edges.add(new Edge(otherNode, weight));
        degree++;
    }

    public Integer getDegree()
    {
        return degree;
    }

    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("A Node with name: " + name + " and outgoing edges: {");
        for (Edge edge : edges) {
            str.append(edge.toString());
            str.append("\n");
        }
        str.append("}");
        return str.toString();
    }

}
