package leetcode.permutations__LeetCode_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsSolution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        backtrack(sol, nums, 0);
        return sol;
    }


    public void backtrack(List<List<Integer>> sol, int [] nums, int index){
        if (index == nums.length - 1){
            sol.add(new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList())));
            return;
        }
        for (var i = index; i < nums.length; i++){
            swap(nums, index, i);
            backtrack(sol, nums, index + 1);
            swap(nums, index, i);
        }
    }
    private void swap (int [] arr, int x, int y){
        if (x == y) return;
        arr[x] += arr[y];  // 1 + 2 => 3   | 1 + 1 = 2
        arr[y] = arr[x] - arr[y]; // 3 - 2 => 1  |  1 - 1 = 1
        arr[x] = arr[x] - arr[y]; // 3 - 1 => 2
    }
}