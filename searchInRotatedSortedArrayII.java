public class searchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {

        if(nums.length == 1){
            return nums[0] == target;
        }

        int start = 0, end = nums.length - 1, mid;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return true;
            }

            else if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } 

            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return false;
    }
}
