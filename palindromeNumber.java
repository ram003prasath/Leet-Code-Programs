public class palindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int d = 0, num = x, s=0;

        while(num>0){
            d = num % 10;
            s = (s*10)+d;
            num = num / 10;
        } 

        return s == x;

    }
}
