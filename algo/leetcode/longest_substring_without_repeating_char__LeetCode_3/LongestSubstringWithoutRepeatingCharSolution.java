package leetcode.longest_substring_without_repeating_char__LeetCode_3;

public class LongestSubstringWithoutRepeatingCharSolution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int [] indexes = new int[127];
        int startIndex = 0;

        for (var pointer = 0; pointer < s.length(); pointer++){
            var charIndex = s.charAt(pointer);
            if (indexes[charIndex] > startIndex){
                startIndex = indexes[charIndex];
            }
            indexes[charIndex] = pointer + 1;
            max = Math.max(max, pointer - startIndex + 1);
        }
        return max;
    }
}
