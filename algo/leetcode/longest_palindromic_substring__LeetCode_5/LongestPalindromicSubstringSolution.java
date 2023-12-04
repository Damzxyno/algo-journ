package leetcode.longest_palindromic_substring__LeetCode_5;

public class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        var solution = "";
        for (var i = 0; i < s.length(); i++){
            for (var j = i + 1; j <= s.length(); j++){
                var subString = s.substring(i, j);
                if (subString.length() > solution.length() && isPalindrome(subString)){
                    solution = subString;
                }
            }
        }
        return solution;
    }

    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
