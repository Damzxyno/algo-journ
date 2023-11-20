package test.leetcode.two_sum__LeetCode1;

import algo.leetcode.two_sum__LeetCode1.TwoSumSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    TwoSumSolution solution = new TwoSumSolution();

    @Test
    public void test1 (){
        var nums = new int [] {2,7,11,15};
        var target = 9;
        var result = new int [] {0, 1};
        Assert.assertArrayEquals(solution.twoSum(nums, target), result);
    }

    @Test
    public void test2 (){
        var nums = new int [] {3,2,4};
        var target = 6;
        var result = new int [] {1, 2};
        Assert.assertArrayEquals(solution.twoSum(nums, target), result);

    }

    @Test
    public void test3 (){
        var nums = new int [] {3, 3};
        var target = 6;
        var result = new int [] {0, 1};
        Assert.assertArrayEquals(solution.twoSum(nums, target), result);

    }
}
