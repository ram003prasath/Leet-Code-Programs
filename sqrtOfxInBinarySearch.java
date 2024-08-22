public class sqrtOfxInBinarySearch {
    public int mySqrt(int x) {
        int start = 1, end = x, mid, ans=0;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(x/mid <= mid){
                ans = x/mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;

    }
}
