package leetcode.palindrome_number__LeetCode9;

public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        var xC = x;
        var revX = 0;
        while(xC > 0){
            revX *= 10;
            revX += xC % 10;
            xC /= 10;
        }
        return revX == x;
    }
}