package leetcode.zigzag_conversion__LeetCode6;

import leetcode.zigzag_conversion__LeetCode_6.ZigZagConversionSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final ZigZagConversionSolution solution = new ZigZagConversionSolution();
    @Test
    public void test1(){
        var input = "PAYPALISHIRING";
        var expected = "PAHNAPLSIIGYIR";
        var numOfRows = 3;
        var result = solution.convert(input, numOfRows);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        var input = "PAYPALISHIRING";
        var expected = "PINALSIGYAHRPI";
        var numOfRows = 4;
        var result = solution.convert(input, numOfRows);
        Assert.assertEquals(expected, result);
    }
}
