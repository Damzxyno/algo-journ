package leetcode.longest_palindromic_substring__LeetCode_5;

public class AnotherLongestPalindromicSubStringSolution {
    int size = 0;
    int index = 0;
    public String longestPalindrome(String s) {
        char [] input = s.toCharArray();
        for (var i =0; i < s.length(); i++){
            expandPalindrome(input, i, i);
            expandPalindrome(input, i,  i + 1);
        }
        return s.substring(index, index + size);
    }

    private void expandPalindrome(char [] input, int startA, int startB){
        while(startA >= 0 && startB < input.length  && input[startA] == input[startB]){
            startA--;
            startB++;
        }
        if (startB - startA - 1> size){
            index = startA + 1;
            size = startB - startA - 1;
        }
    }
}
