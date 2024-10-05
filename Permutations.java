import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, 0, ans);
        return ans;
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
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

        for(int i=index; i<nums.length; i++){
            swap(nums, i, index);
            permute(nums, index+1, ans);
            swap(nums, i, index);
        }
    }
}
