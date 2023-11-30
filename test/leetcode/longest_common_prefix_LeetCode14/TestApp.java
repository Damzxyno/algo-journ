package leetcode.longest_common_prefix_LeetCode14;

import leetcode.longest_common_prefix__LeetCode14.LongestCommonPrefixSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

    @Test
    public void test1(){
        var request = new String [] {"flower","flow","flight"};
        var result = "fl";
        var response = solution.longestCommonPrefix(request);
        Assert.assertEquals(result, response);
    }

    @Test
    public void test2(){
        var request = new String [] {"dog","racecar","car"};
        var result = "";
        var response = solution.longestCommonPrefix(request);
        Assert.assertEquals(result, response);
    }

    @Test
    public void test3(){
        var request = new String [] {"ab", "a"};
        var result = "a";
        var response = solution.longestCommonPrefix(request);
        Assert.assertEquals(result, response);
    }

    @Test
    public void test4(){
        var request = new String [] {"a"};
        var result = "a";
        var response = solution.longestCommonPrefix(request);
        Assert.assertEquals(result, response);
    }

    @Test
    public void test5(){
        var request = new String [] {""};
        var result = "";
        var response = solution.longestCommonPrefix(request);
        Assert.assertEquals(result, response);
    }
}
