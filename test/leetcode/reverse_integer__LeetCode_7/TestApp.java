package leetcode.reverse_integer__LeetCode_7;

import leetcode.reverse_integer__Leetcode_7.ReverseIntegerSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    ReverseIntegerSolution solution = new ReverseIntegerSolution();

    @Test
    public void test1(){
        var req = 123;
        var expected = 321;
        var result = solution.reverse(req);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        var req = -123;
        var expected = -321;
        var result = solution.reverse(req);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void test3(){
        var req = 1534236469;
        var expected = 0;
        var result = solution.reverse(req);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void test4(){
        var req = -1534236469;
        var expected = 0;
        var result = solution.reverse(req);
        Assert.assertEquals(expected, result);
    }
}
