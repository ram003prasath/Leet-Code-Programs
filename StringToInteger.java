public class StringToInteger{
    public int myAtoi(String s) {
        if(s.length() == 0 || s == null){ return 0; }

        s = s.trim();
        int digit=0, sign=1, i=0, sum=0;

        if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i)=='+')){
            sign = s.charAt(i++) == '-'? -1 : 1;
        }
        
        for(; i<s.length(); i++){
            digit = s.charAt(i) - '0';
            if(0 <= digit && digit <= 9){
                if(sum > (Integer.MAX_VALUE - digit)/10){
                    return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                sum = sum * 10 + digit;
            }
            else{
                break;
            }
        } 
        return sum * sign;  
    }
}
