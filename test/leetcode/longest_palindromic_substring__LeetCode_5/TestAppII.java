package leetcode.longest_palindromic_substring__LeetCode_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestAppII {
    private final AnotherLongestPalindromicSubStringSolution solution = new AnotherLongestPalindromicSubStringSolution();


    @Test
    public void test1(){
        var req = "babad";
        var validOutputs = List.of("bab", "aba");
        var res = solution.longestPalindrome(req);
        var message = String.format("Expected one of the following: %s, but got %s", validOutputs, res);
        Assert.assertTrue(message, validOutputs.contains(res));
    }

    @Test
    public void test2(){
        var req = "a";
        var validOutputs = List.of("a");
        var res = solution.longestPalindrome(req);
        var message = String.format("Expected one of the following: %s, but got %s", validOutputs, res);
        Assert.assertTrue(message, validOutputs.contains(res));
    }

    @Test
    public void test3(){
        var req = "abb";
        var validOutputs = List.of("bb");
        var res = solution.longestPalindrome(req);
        var message = String.format("Expected one of the following: %s, but got %s", validOutputs, res);
        Assert.assertTrue(message, validOutputs.contains(res));
    }
}
