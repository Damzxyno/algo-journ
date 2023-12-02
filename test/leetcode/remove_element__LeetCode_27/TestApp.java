package leetcode.remove_element__LeetCode_27;

import helpers.LinkedListHelper;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final RemoveElementSolution solution = new RemoveElementSolution();
    private final LinkedListHelper llh = new LinkedListHelper();

    @Test
    public void test1(){
        var req = new int [] {3,2,2,3};
        var valToRemove = 3;
        var expectedRes = 2;
        var expectedArr = new int []{2, 2};
        var response = solution.removeElement(req, valToRemove);
        var message = String.format("Expected %s, got %s.", llh.stringifyArr(expectedArr), llh.stringifyArr(req));
        Assert.assertTrue(message, llh.confirmLArray(expectedArr, req));
        Assert.assertEquals(expectedRes, response);
    }

    @Test
    public void test2(){
        var req = new int [] {0,1,2,2,3,0,4,2};
        var valToRemove = 2;
        var expectedRes = 5;
        var expectedArr = new int []{0,1,3,0,4};
        var response = solution.removeElement(req, valToRemove);
        var message = String.format("Expected %s, got %s.", llh.stringifyArr(expectedArr), llh.stringifyArr(req));
        Assert.assertTrue(message, llh.confirmLArray(expectedArr, req));
        Assert.assertEquals(expectedRes, response);
    }
}
