import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LevelChecker {
    
    /** 
     * Returns true if the level can be completed
     * 
     * @param level an array of integers, representing the level to be checked
     * @return boolean
     */
    public static boolean check(int[] level) {
        if(level.length == 1 & level[0]>0){
            return true;
        }
        if (level[0] == 0) {
            return false;
        }
        int maxJump = Math.min(level[0], level.length - 1);
        for (int i = 1; i <= maxJump; i++) {
            int[] A = Arrays.copyOfRange(level, i, level.length);
            if(check(A)){
                return true;
            }
        }
        return false;
    }


    /** 
     * returns true if the level is completable, using a dynamic programming approach
     * 
     * @param level an array of integers, representing the level to be checked
     * @return boolean
     */
    public static boolean betterCheck(int[] level) {
        boolean[] possible = new boolean[level.length];
        if(level[level.length-1] != 0){
            possible[possible.length-1] = true;
        }
        for (int i = level.length-2; i >= 0; i--) {
            for (int j = 0; j <= level[i]; j++) {
                if(j+i>=level.length){
                    break;
                }
                if (possible[i+j]) {
                    possible[i] = true;
                    break;
                }
            }
        }
        return possible[0];
    }

    
    /** 
     * returns the solution for the level which takes least jumps as a list of integers
     * 
     * @param level an array of integers, representing the level to be checked
     * @return List<Integer>
     */
    public static List<Integer> getJumps(int[] level) {
        if (!check(level)) {
            return new LinkedList<Integer>();
        }

        List<List<Integer>> allPaths = new LinkedList<List<Integer>>();

        getJumpsHelper(level, new LinkedList<Integer>(), allPaths);

        List<Integer> bestPath = allPaths.get(0);
        for (int i = 1; i < allPaths.size(); i++) {
            if(allPaths.get(i).size() < bestPath.size()){
                bestPath = allPaths.get(i);
            }
        }
        return bestPath;
    }

    
    /** 
     * recursive helper function for getJumps
     * 
     * @param level an array of integers, representing the level to be checked
     * @param currentPath the current path taken to get to this part of the recursive stack
     * @param allPaths all of the current paths, should be a reference to an empty list
     */
    private static void getJumpsHelper
        (int[] level, List<Integer> currentPath, List<List<Integer>> allPaths) {
        if(level.length == 1 & level[0]>0){
            allPaths.add(currentPath);
            return;
        }
        int maxJump = Math.min(level[0], level.length - 1);
        for (int i = 1; i <= maxJump; i++) {
            int[] A = Arrays.copyOfRange(level, i, level.length);
            if(check(A)){
                List<Integer> newPath = new LinkedList<Integer>(currentPath);
                newPath.add(i);
                getJumpsHelper(A, newPath, allPaths);
            }
        }
        return;
    }
}