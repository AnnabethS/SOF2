public class Edge {

    private Node destination;
    private int weight;

    public Edge(Node destinationNode, int weight)
    {
        destination = destinationNode;
        this.weight = weight;
    }

    public Node getDestination()
    {
        return destination;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight(Integer w)
    {
        if (w>0)
        {
            weight = w;
        }
    }

    public String toString()
    {
        return ("[Destination: " + destination.name + ", Weight: " + weight + "]");
    }
}
