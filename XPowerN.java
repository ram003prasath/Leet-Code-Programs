public class XPowerN {
    public double myPow(double x, int n) {
        if(n >= 0){
            return power(x, n);
        }
        else{
            return 1/power(x, -1*n);
        }
    }
    public double power(double x, int n){
        if(n == 0){
            return 1.0;
        }
        double half = power(x, n/2);
        if(n%2 == 0){
            return half * half;
        }
        return half * half * x;
    }
}
