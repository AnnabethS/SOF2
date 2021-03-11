public class UndirectedWeightedGraph extends DirectedWeightedGraph {
    
    public boolean addEdge(Node node1, Node node2, Integer weight)
    {
        super.addEdge(node1, node2, weight);
        super.addEdge(node2, node1, weight);
        return true;
    }

    public boolean addEdge(String node1Name, String node2Name, Integer weight)
    {
        boolean check = super.addEdge(node1Name, node2Name, weight);
        if (check)
        {
            super.addEdge(node2Name, node1Name, weight);
        }
        return check;
    }
}
