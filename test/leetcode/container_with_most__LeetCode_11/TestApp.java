package leetcode.container_with_most__LeetCode_11;

import leetcode.container_with_most_water__LeetCode_11.ContainerWithMostWaterSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final ContainerWithMostWaterSolution solution = new ContainerWithMostWaterSolution();

    @Test
    public void test1(){
        var req = new int [] {1,8,6,2,5,4,8,3,7};
        var expected = 49;
        var res = solution.maxArea(req);
        Assert.assertEquals(expected, solution.maxArea(req));
    }

    @Test
    public void test2(){
        var req = new int [] {1,1};
        var expected = 1;
        var res = solution.maxArea(req);
        Assert.assertEquals(expected, solution.maxArea(req));
    }

    @Test
    public void test3(){
        var req = new int [] {2,3,4,5,18,17,6};
        var expected = 17;
        var res = solution.maxArea(req);
        Assert.assertEquals(expected, solution.maxArea(req));
    }

    @Test
    public void test4(){
        var req = new int [] {};
        var expected = 0;
        var res = solution.maxArea(req);
        Assert.assertEquals(expected, solution.maxArea(req));
    }

}
