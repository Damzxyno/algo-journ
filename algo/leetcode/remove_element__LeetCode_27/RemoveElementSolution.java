package leetcode.remove_element__LeetCode_27;

public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        var a = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                if (i != a){
                    nums[a] = nums[i];
                    nums[i] = val;
                }
                a++;
                count++;
            }
        }
        return count;
    }
}
