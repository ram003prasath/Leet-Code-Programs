public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;

        int count1[] = new int[26];
        for(char c : s1.toCharArray()){
            count1[c- 'a']++;
        }

        int count2[] = new int[26];
        for(int i=0; i<len1; i++){
            count2[s2.charAt(i) - 'a']++;
        }
        if(match(count1, count2)) return true;

        for(int i=len1; i<len2; i++){
            char newchar = s2.charAt(i);
            char oldchar = s2.charAt(i-len1);
            count2[newchar - 'a']++;
            count2[oldchar - 'a']--;

            if(match(count1,count2)) return true;
        }
        return false;
    }

    public boolean match(int count1[], int count2[]){
        for(int i=0; i<26; i++){
            if(count1[i] != count2[i]) return false;
        }
        return true;
    }
}
