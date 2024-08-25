public class findMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int start = 0, end = nums.length - 1, mid;

        if(nums[start] < nums[end]){return nums[start];}

        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];

    }
}
