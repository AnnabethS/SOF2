public class UndirectedUnweightedGraph extends UndirectedWeightedGraph{
    public boolean addEdge(Node node1, Node node2)
    {
        return super.addEdge(node1, node2, 1);
    }

    public boolean addEdge(String node1Name, String node2Name)
    {
        return super.addEdge(node1Name, node2Name, 1);
    }
}
