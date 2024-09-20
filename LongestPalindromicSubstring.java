public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0; i<s.length(); i++){
            //odd length
            res = findPalindrome(s, res, i, i);
            //even length
            res = findPalindrome(s, res, i, i+1);
        }
        return res;
    }
    public String findPalindrome(String s, String res, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            if((r-l+1) > res.length()){
                res = s.substring(l, r+1);
            }
            l--;
            r++;
        }
        return res;
    }
}
