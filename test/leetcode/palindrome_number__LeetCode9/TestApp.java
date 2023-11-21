package leetcode.palindrome_number__LeetCode9;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    PalindromeNumberSolution solution = new PalindromeNumberSolution();

    @Test
    public void test1 (){
        var req = 121;
        var res = solution.isPalindrome(req);
        Assert.assertTrue(res);
    }

    @Test
    public void test2 (){
        var req = -121;
        var res = solution.isPalindrome(req);
        Assert.assertFalse(res);
    }

    @Test
    public void test3 (){
        var req = 1345431;
        var res = solution.isPalindrome(req);
        Assert.assertTrue(res);
    }
}
