import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DirectedWeightedGraph implements IGraph {

    private HashMap<String, Node> nodeMap;

    public DirectedWeightedGraph()
    {
        nodeMap = new HashMap<String, Node>();
    }

    public boolean addNode(String name) 
    {
        if (nodeMap.get(name)==null) 
        {
            nodeMap.put(name, new Node(name));
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean addEdge(Node startNode, Node destinationNode, Integer weight) 
    {
        startNode.addEdge(destinationNode, weight);
        return true;
    }

    public boolean addEdge(String startNodeName, String destinationNodeName, Integer weight)
    {
        Node startNode = getNode(startNodeName);
        if(startNode==null)
        {
            return false;
        }
        Node destinationNode = getNode(destinationNodeName);
        if(destinationNode==null)
        {
            return false;
        }
        return addEdge(startNode, destinationNode, weight);
    }

    public HashMap<String, Node> getNodes() {
        return nodeMap;
    }

    public Node getNode(String name)
    {
        return nodeMap.get(name);
    }
    
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("Directed Weighted Graph:\n");
        Iterator<Entry<String, Node>> iter = nodeMap.entrySet().iterator();
        while(iter.hasNext())
        {
            Map.Entry<String, Node> i = (Map.Entry<String, Node>) iter.next();
            str.append(i.getValue().toString());
            str.append("\n");
        }
        return str.toString();
    }
}
