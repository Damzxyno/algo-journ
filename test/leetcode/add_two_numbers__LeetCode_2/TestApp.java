package leetcode.add_two_numbers__LeetCode_2;

import helpers.LinkedListHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    private final AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
    private final LinkedListHelper llh = new LinkedListHelper();

    @Test
    public void test1(){
        var req1 = llh.generateListNode(2, 4, 3);
        var req2 = llh.generateListNode(5, 6, 4);
        var expected = new int []{7, 0, 8};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", llh.stringifyArr(expected), llh.stringifyNode(result));
        Assert.assertTrue(message, llh.confirmListNode(result, expected));
    }

    @Test
    public void test2(){
        var req1 = llh.generateListNode(0);
        var req2 = llh.generateListNode(0);
        var expected = new int []{0};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", llh.stringifyArr(expected), llh.stringifyNode(result));
        Assert.assertTrue(message, llh.confirmListNode(result, expected));
    }

    @Test
    public void test3(){
        var req1 = llh.generateListNode(9,9,9,9,9,9,9);
        var req2 = llh.generateListNode(9,9,9,9);
        var expected = new int []{8,9,9,9,0,0,0,1};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", llh.stringifyArr(expected), llh.stringifyNode(result));
        Assert.assertTrue(message, llh.confirmListNode(result, expected));
    }

    @Test
    public void test4(){
        var req1 = llh.generateListNode(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1);
        var req2 = llh.generateListNode(5,6,4);
        var expected = new int []{6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", llh.stringifyArr(expected), llh.stringifyNode(result));
        Assert.assertTrue(message, llh.confirmListNode(result, expected));
    }
}
