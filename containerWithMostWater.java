public class containerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max = 0, area;

        while(l <= r){
            area = height[l] < height[r] ? height[l]*(r-l) : height[r]*(r-l);

            if(area > max){
                max = area;
            }
            else if(height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }
        }

        return max;

    }
}
