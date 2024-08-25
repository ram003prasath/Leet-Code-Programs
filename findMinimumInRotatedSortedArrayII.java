public class findMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        if(nums.length == 1){return nums[0];}

        int start = 0, end = nums.length - 1, mid;

        if(nums[start] < nums[end]){return nums[0];}

        while(start < end){
            mid = start + (end - start) / 2;

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }

            else if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
        return start;

    }
}
