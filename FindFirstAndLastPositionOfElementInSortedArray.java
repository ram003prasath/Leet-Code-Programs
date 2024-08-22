public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = find(nums,target,true);
        arr[1] = find(nums,target,false);

        return arr;
    }

    public int find(int[] nums, int target, Boolean bool){
        int start = 0, end = nums.length - 1, mid, position = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                position = mid;
                if(bool == true){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return position;
    }
}
