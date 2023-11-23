package leetcode.longest_consecutive_sequence__LeetCode125;

import java.util.HashSet;

public class LongestConsecutiveSequenceSolution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        var consecutiveCount = 0;
        for (var num : nums){
            set.add(num);
        }

        for(var num : nums){
            var currConsecutiveCount = 0;
            if (!set.contains(num - 1)){
                while(set.contains(num)){
                    currConsecutiveCount++;
                    num++;
                }
            }
            consecutiveCount = Math.max(consecutiveCount, currConsecutiveCount);
        }
        return consecutiveCount;
    }
}
