import java.util.ArrayList;
import java.util.HashMap;

public interface IGraph {
    public boolean addNode(String name); 
    //the boolean return is to represent whether the addition was successful or not 

    public HashMap<String, Node> getNodes();
}
