import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
public class ReconstructItinerary {
    Map<String, PriorityQueue<String>> graph = new HashMap<>();
    List<String> result = new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        String src, des;

        for(int i=0; i<tickets.size(); i++){
            src = tickets.get(i).get(0);
            des = tickets.get(i).get(1);
            graph.putIfAbsent(src, new PriorityQueue<>());
            graph.get(src).add(des);
        }

        dfs("JFK");

        return result;
    }

    public void dfs(String src){
        PriorityQueue<String> des = graph.get(src);

        while(des != null && !des.isEmpty()){
            String nextDes = des.poll();
            dfs(nextDes);
        }

        result.addFirst(src);
    }
}
