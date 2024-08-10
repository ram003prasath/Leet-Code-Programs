
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (Integer num : nums1) {
            set.add(num);
        }

        Set<Integer> intset = new HashSet<>();
        for (Integer num : nums2) {
            if(set.contains(num)){
                intset.add(num);
            }
        }

        int arr[] = new int[intset.size()];
        int i=0;

        for (int num : intset) {
            arr[i++] = num;
        }

        return arr;
    }
}
