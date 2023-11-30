package leetcode.remove_duplicates_from_sorted_array__LeetCode26;

public class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        var curr = nums[0];
        var index = 1;
        var unique = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != curr){
                curr = nums[i];
                nums[index] = nums[i];
                index++;
                unique++;
            }
        }
        return unique;
    }
}
