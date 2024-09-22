import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class EvaluateDivision {
    Map<String, Map<String, Double>> graph = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        String src, des;

        for(int i=0; i<equations.size(); i++){
            src = equations.get(i).get(0);
            des = equations.get(i).get(1);

            graph.putIfAbsent(src, new HashMap<>());
            graph.get(src).put(des, values[i]);

            graph.putIfAbsent(des, new HashMap<>());
            graph.get(des).put(src, 1/values[i]);
        }

        double result[] = new double[queries.size()];
        for(int i=0; i<queries.size(); i++){
            src = queries.get(i).get(0);
            des = queries.get(i).get(1);

            if(!graph.containsKey(src) || !graph.containsKey(des)){
                result[i] = -1.0;
            }
            else if(src == des){
                result[i] = 1.0;
            }
            else{
                Set<String> visited = new HashSet<>();
                result[i] = dfs(src,des, 1.0, visited);
            }
        }
        return result;
    }

    public double dfs(String src, String des, double value, Set<String> visited){
        if(visited.contains(src)){
            return -1.0;
        }

        visited.add(src);
        Map<String, Double> neighbors = graph.get(src);
        if(neighbors.containsKey(des)){
            return value * neighbors.get(des);
        }
        
        for(Map.Entry<String, Double> entry : neighbors.entrySet()){
            String next = entry.getKey();
            double weight = entry.getValue();
            double result = dfs(next, des, value * weight, visited);
            if(result != -1.0){
                return result;
            }
        }
        return -1.0;
    }
}
