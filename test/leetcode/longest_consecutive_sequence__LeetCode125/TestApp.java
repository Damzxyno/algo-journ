package leetcode.longest_consecutive_sequence__LeetCode125;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    LongestConsecutiveSequenceSolution solution = new LongestConsecutiveSequenceSolution();

    @Test
    public void test1(){
        var req = new int [] {100,4,200,1,3,2};
        Assert.assertEquals(4, solution.longestConsecutive(req));
    }
    @Test
    public void test2(){
        var req = new int [] {0,3,7,2,5,8,4,6,0,1};
        Assert.assertEquals(9, solution.longestConsecutive(req));
    }
    @Test
    public void test3(){
        var req = new int [] {104, 100, 103, 4,200, 101, 105, 106, 1,3,2, 102};
        Assert.assertEquals(7, solution.longestConsecutive(req));
    }
}
