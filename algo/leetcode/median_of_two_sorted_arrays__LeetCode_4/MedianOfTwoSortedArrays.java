package leetcode.median_of_two_sorted_arrays__LeetCode_4;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length + nums2.length];
        int x = 0;
        int y = 0;

        var mid = (nums1.length + nums2.length) / 2;
        for (var i = 0; i < arr.length; i++){
            if (x == nums1.length) {
                arr[i] = nums2[y];
                y++;
            } else if (y == nums2.length) {
                arr[i] = nums1[x];
                x++;
            } else if (nums1[x] < nums2[y]){
                arr[i] = nums1[x];
                x++;
            } else {
                arr[i] = nums2[y];
                y++;
            }
        }
        return (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0;
    }
}
