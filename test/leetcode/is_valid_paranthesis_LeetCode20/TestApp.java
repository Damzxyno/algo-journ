package leetcode.is_valid_paranthesis_LeetCode20;

import leetcode.is_valid_paranthesis__LeetCode20.IsValidParanthesisSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    IsValidParanthesisSolution solution = new IsValidParanthesisSolution();

    @Test
    public void test1 (){
        var req = "(){}[]";
        Assert.assertTrue(solution.isValid(req));
    }
    @Test
    public void test2 (){
        var req = "()";
        Assert.assertTrue(solution.isValid(req));
    }
    @Test
    public void test3 (){
        var req = "(]";
        Assert.assertFalse(solution.isValid(req));
    }

    @Test
    public void test5 (){
        var req = "}{[]()[]";
        Assert.assertFalse(solution.isValid(req));
    }
}
