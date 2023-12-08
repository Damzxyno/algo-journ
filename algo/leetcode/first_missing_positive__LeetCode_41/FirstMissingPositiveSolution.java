package leetcode.first_missing_positive__LeetCode_41;

public class FirstMissingPositiveSolution {
    public int firstMissingPositive(int[] nums) {
        var real = new int [nums.length];
        for (var item : nums){
            if (item >= 1 && item <= real.length){
                real[item - 1]++;
            }
        }

        for (var i = 1; i <= nums.length; i++){
            if (real[i - 1] == 0){
                return i;
            }
        }

        return nums.length + 1;

    }
}
