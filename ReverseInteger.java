public class ReverseInteger {
    public int reverse(int x) {
        int num, sum = 0, f = 1;
        if( x < 0){
            x *= -1;
            f = -1;
        }
        while(x > 0){
            num = x % 10;
            if(sum > (Integer.MAX_VALUE-num)/10){
                return 0;
            }
            sum = sum * 10 + num;
            x /= 10;
        }
        return sum * f;
    }
}
