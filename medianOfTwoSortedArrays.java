

class medianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n], i=0, j=0, k=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }

        while(i<m){
            arr[k++] = nums1[i++];
        }

        while(j<n){
            arr[k++] = nums2[j++];
        }

        int len = arr.length;
        if (len % 2 == 0) {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            return arr[len / 2];
        }

    }
}