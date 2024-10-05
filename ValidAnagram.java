public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int counts[] = new int[26];
        for(char c : s.toCharArray()){
            counts[c - 'a']++;
        }
        int countt[] = new int[26];
        for(char c : t.toCharArray()){
            countt[c - 'a']++;
        }

        return match(counts, countt);
    }

    public boolean match(int[] arr1, int[] arr2){
        for(int i=0; i<26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
