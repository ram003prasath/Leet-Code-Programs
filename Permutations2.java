import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, 0, ans);
        return ans;
    }

    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void permute(int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> lst = new ArrayList<>();
            for(int num : nums){
                lst.add(num);
            }
            ans.add(lst);
            return;
        }
        boolean isused[] = new boolean[21];
        for(int i=index; i<nums.length; i++){
            if(isused[nums[i]+10]) continue;
            isused[nums[i]+10] = true;
            swap(nums, i, index);
            permute(nums,index+1, ans);
            swap(nums, i, index);
        }
    }
}
