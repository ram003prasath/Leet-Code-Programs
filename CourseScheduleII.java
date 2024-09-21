import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class CourseScheduleII {
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    List<Integer> order = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int course, pre;

        for(int i=0; i<numCourses; i++){
            graph.put(i, new HashSet<>());
        }

        for(int prerequisite[] : prerequisites){
            course = prerequisite[0];
            pre = prerequisite[1];
            graph.get(course).add(pre);
        }

        for(int i=0; i<numCourses; i++){
            if(!visited.contains(i)){
                if(!dfs(i)){
                    return new int[0];
                }
            }
        }

        int result[] = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            result[i] = order.get(i);    
        }

        return result;
    }

    public boolean dfs(int course){
        if(visiting.contains(course)){ return false; }
        if(visited.contains(course)){ return true; }

        visiting.add(course);

        for(int pre : graph.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }

        visiting.remove(course);
        visited.add(course);
        order.add(course);

        return true;
    }
}
