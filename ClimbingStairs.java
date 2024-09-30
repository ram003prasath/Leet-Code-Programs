public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int num1 = 1;
        int num2 = 1, result = 0;
        for(int i=1; i<n; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
