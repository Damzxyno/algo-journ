namespace DefaultNamespace;

public class TwoSumSolution
{
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> map = new();
        for (var i = 0; i < nums.Length; i++){
            if (map.ContainsKey(nums[i])){
                return new int [] {map[nums[i]], i};
            } else {
                map[target - nums[i]] =  i;
            }
        }
        return new int[] {0,0};
    }
}