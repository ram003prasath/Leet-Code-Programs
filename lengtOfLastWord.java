public class lengtOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int prevLen = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == ' '){
                length = 0;
            }
            else{
                prevLen = length++;
            }
        }

        return prevLen+1;

    }
}
