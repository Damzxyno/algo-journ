package leetcode.first_missing_positive__LeetCode_41;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final FirstMissingPositiveSolution solution = new FirstMissingPositiveSolution();

    @Test
    public void test1(){
        var req = new int [] {1,2,0};
        var expected = 3;
        var response = solution.firstMissingPositive(req);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void test2(){
        var req = new int [] {3,4,-1,1};
        var expected = 2;
        var response = solution.firstMissingPositive(req);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void test3(){
        var req = new int [] {7,8,9,11,12};
        var expected = 1;
        var response = solution.firstMissingPositive(req);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void test4(){
        var req = new int [] {1};
        var expected = 2;
        var response = solution.firstMissingPositive(req);
        Assert.assertEquals(expected, response);
    }
}
