package leetcode.swap_nodes_in_pairs__LeetCode_24;

import helpers.LinkedListHelper;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final SwapNodesInPairsSolution solution = new SwapNodesInPairsSolution();
    private final LinkedListHelper helper = new LinkedListHelper();


    @Test
    public void test1(){
        var req = helper.generateListNode(1, 2, 3, 4);
        var expected = new int [] {2, 1, 4, 3};
        var res = solution.swapPairs(req);
        Assert.assertTrue(String.format("Expected %s, but got %s.", helper.stringifyArr(expected), helper.stringifyNode(res)),
                helper.confirmListNode(res, expected));
    }

    @Test
    public void test2(){
        var req = helper.generateListNode(1);
        var expected = new int [] {1};
        var res = solution.swapPairs(req);
        Assert.assertTrue(String.format("Expected %s, but got %s.", helper.stringifyArr(expected), helper.stringifyNode(res)),
                helper.confirmListNode(res, expected));
    }


    @Test
    public void test3(){
        var req = helper.generateListNode();
        var expected = new int [] {};
        var res = solution.swapPairs(req);
        Assert.assertTrue(String.format("Expected %s, but got %s.", helper.stringifyArr(expected), helper.stringifyNode(res)),
                helper.confirmListNode(res, expected));
    }

    @Test
    public void test4(){
        var req = helper.generateListNode(1, 9, 7);
        var expected = new int [] {9, 1, 7};
        var res = solution.swapPairs(req);
        Assert.assertTrue(String.format("Expected %s, but got %s.", helper.stringifyArr(expected), helper.stringifyNode(res)),
                helper.confirmListNode(res, expected));
    }
}
