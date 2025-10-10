class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int index = 0;
        int n = 0;
        int m = 0;

        while(n != nums1.length && m != nums2.length){
            if(nums1[n] < nums2[m]){
                mergedArray[index] = nums1[n];
                index++;
                n++;
            }else{
                mergedArray[index] = nums2[m];
                index++;
                m++;
            }
        }

        while(n != nums1.length){
            mergedArray[index] = nums1[n];
            index++;
            n++;
        }

        while(m != nums2.length){
            mergedArray[index] = nums2[m];
            index++;
            m++;
        }
        
        int mergedLength = mergedArray.length;

        if(mergedLength % 2 != 0)
            return mergedArray[mergedLength / 2];
        
        double ans = (mergedArray[mergedLength / 2] + mergedArray[(mergedLength - 1) / 2]) / 2.0;

        return ans;
    }
}