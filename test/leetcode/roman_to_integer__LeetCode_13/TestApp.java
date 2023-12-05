package leetcode.roman_to_integer__LeetCode_13;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final RomanToIntegerSolution solution = new RomanToIntegerSolution();

    @Test
    public void test1(){
        var req = "III";
        var expected = 3;
        var res = solution.romanToInt(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test2(){
        var req = "LVIII";
        var expected = 58;
        var res = solution.romanToInt(req);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void test3(){
        var req = "MCMXCIV";
        var expected = 1994;
        var res = solution.romanToInt(req);
        Assert.assertEquals(expected, res);
    }
}
