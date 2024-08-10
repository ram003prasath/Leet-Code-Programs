import java.util.HashMap;

class  kthDistinctEle{
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        int count=0;

        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);
        }

        for (String str : arr) {
            if(frequencyMap.get(str)==1){
                count++;
                if(count==k){
                    return str;
                }
            }
        }

        return "";
    }
}