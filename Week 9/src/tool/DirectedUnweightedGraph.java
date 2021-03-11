public class DirectedUnweightedGraph extends DirectedWeightedGraph{
    
    public boolean addEdge(Node startNode, Node destinationNode)
    {
        return super.addEdge(startNode, destinationNode, 1);
    }

    public boolean addEdge(String startNodeName, String destinationNodeName)
    {
        return super.addEdge(startNodeName, destinationNodeName, 1);
    }
}
