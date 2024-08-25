public class findPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){return nums[0];}

        int start = 0, end = nums.length - 1, mid;

        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
