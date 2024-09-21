import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CourseSchedule {
    Map<Integer, Set<Integer>> preMap = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int course, pre;

        for(int i=0; i<numCourses; i++){
            preMap.put(i, new HashSet<>());
        }

        for(int prerequisite[] : prerequisites){
            course = prerequisite[0];
            pre = prerequisite[1];
            preMap.get(course).add(pre);
        }

        for(int i=0; i<numCourses; i++){
            if(!dfs(i)){
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int course){

        if(visiting.contains(course)){
            return false;
        }

        if(visited.contains(course)){
            return true;
        }

        visiting.add(course);

        for(int pre : preMap.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }

        visiting.remove(course);
        visited.add(course);

        return true;
    }
}
