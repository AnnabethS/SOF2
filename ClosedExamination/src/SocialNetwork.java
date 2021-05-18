import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SocialNetwork {
    String name;
    Map<String, User> users;


    /** 
     * Creates a new instance of the SocialNetwork Class with an empty users HashMap and 
     * a name defined by the param networkName
     * 
     * @param networkName The name attribute of the class
     * @return SocialNetwork
     */
    public SocialNetwork(String networkName){
        users = new HashMap<String, User>();
        name = networkName;
    }

    
    /** 
     * Creates a new instance of the User class and adds it to the users hashmap.
     * 
     * @param userId the ID to give the user
     * @param userName the name to assign to the user
     * @return User the newly created User instance
     * @throws IllegalArgumentException when the id is already in the map
     */
    User createUser(String userId, String userName){
        if(users.get(userId) != null){
            throw new IllegalArgumentException();
        }
        User newUser = new User(userId, userName);
        users.put(userId, newUser);
        return newUser;
    }


    /** 
     * Returns the user with the given ID
     * 
     * @param userId
     * @return User the newly created User instance
     * @throws IllegalArgumentException if the userId does not exist
     */
    User getUser(String userId){
        User user = users.get(userId);
        if(user==null){
            throw new IllegalArgumentException();
        }
        return user;
    }

    
    /** 
     * Adds a relationship between the 2 specified users
     * 
     * @param userOneID the first user's id
     * @param userTwoID the second user's id
     * @return boolean true if relationship was created
     * @throws IllegalArgumentException if any of the users specified do not exist in the hashmap
     */
    boolean addRelationship(String userOneID, String userTwoID){
        User user1 = users.get(userOneID);
        User user2 = users.get(userTwoID);
        if(user1==null | user2==null){
            throw new IllegalArgumentException();
        }
        if(!user1.addConnection(userTwoID)){
            return false;
        }
        if(!user2.addConnection(userOneID)){
            return false;
        }
        return true;
    }

    
    /** 
     * calculates the closeness of a user on the network
     * 
     * @param userId the id of the user to get the closeness of
     * @return double the closeness of the user
     */
    double closeness(String userId){
        if (users.get(userId)==null) {
            throw new IllegalArgumentException();
        }
        double sum = 0d;
        for (User u : users.values()) {
            if(u.id != userId){
                sum += userDistance(userId, u.id);
            }
        }
        return ((users.size() - 1) / sum);
    }

    
    /** 
     * gets the distance between 2 users, assuming they connect
     * 
     * @param user1Id the start user
     * @param user2Id the user to get to
     * @return double the distance between the two users
     */
    double userDistance(String user1Id, String user2Id){
        Set<String> visited = new HashSet<String>();
        List<String> queue = new ArrayList<String>();
        queue.add(0, user1Id);
        while (queue.size() > 0) {
            //iterate over all connections of the currently examined user
            for (String c : users.get(queue.get(0)).connections) { 
                if(c==user2Id){
                    return (double)queue.size();
                }
            }
            visited.add(queue.get(0));
            //this user does not have user2 as its direct connection, try other users
            boolean complete = true;
            //iterate over all connections of the currently examined user
            for (String c : users.get(queue.get(0)).connections) { 
                if(!visited.contains(c)){ //if the user hasnt been visited
                    complete = false;
                    queue.add(0, c); //visit it next
                    break;
                }
            }
            if (complete) {
                queue.remove(0);
            }
        }
        return -1d;
    }
}