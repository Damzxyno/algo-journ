package leetcode.check_two_string_arr_equivalent__LeetCode_1662;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final Check2StringArrEqualSolution solution = new Check2StringArrEqualSolution();

    @Test
    public void test1(){
        var arrA = new String [] {"ab", "c"};
        var arrB = new String [] {"a", "bc"};
        var response = solution.arrayStringsAreEqual(arrA, arrB);
        Assert.assertTrue(response);
    }
    @Test
    public void test2(){
        var arrA = new String [] {"a", "cb"};
        var arrB = new String [] {"ab", "c"};
        var response = solution.arrayStringsAreEqual(arrA, arrB);
        Assert.assertFalse(response);
    }

    @Test
    public void test3(){
        var arrA = new String [] {"abc", "d", "defg"};
        var arrB = new String [] {"abcddefg"};
        var response = solution.arrayStringsAreEqual(arrA, arrB);
        Assert.assertTrue(response);
    }
}
