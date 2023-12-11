package leetcode.climbing_stairs__LeetCode_70;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final ClimbingStairsSolution solution = new ClimbingStairsSolution();

    @Test
    public void test1(){
        var req = 1;
        var expected = 1;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test2(){
        var req = 2;
        var expected = 2;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test3(){
        var req = 3;
        var expected = 3;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test4(){
        var req = 4;
        var expected = 5;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }
    @Test
    public void test5(){
        var req = 5;
        var expected = 8;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }
    @Test
    public void test6(){
        var req = 8;
        var expected = 34;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }
    @Test
    public void test7(){
        var req = 10;
        var expected = 89;
        var res = solution.climbStairs(req);
        Assert.assertEquals(expected, res);
    }

}
