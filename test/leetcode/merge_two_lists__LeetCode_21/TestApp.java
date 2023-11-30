package leetcode.merge_two_lists__LeetCode_21;

import helpers.LinkedListHelper;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    private final MergeTwoListSolution solution = new MergeTwoListSolution();
    private final LinkedListHelper llh = new LinkedListHelper();

    @Test
    public void test1(){
        var list1 = llh.generateListNode(1, 2, 4);
        var list2 = llh.generateListNode(1, 3, 4);
        var expected = new int [] {1, 1,  2, 3, 4};
        var response = solution.mergeTwoLists(list1, list2);
        var message = String.format("Expected %s, but got %s.", llh.stringifyArr(expected), llh.stringifyNode(response));
        Assert.assertTrue(llh.confirmListNode(response, expected));
    }

    @Test
    public void test2(){
        var list1 = llh.generateListNode();
        var list2 = llh.generateListNode();
        var expected = new int [] {};
        var response = solution.mergeTwoLists(list1, list2);
        var message = String.format("Expected %s, but got %s.", llh.stringifyArr(expected), llh.stringifyNode(response));
        Assert.assertTrue(llh.confirmListNode(response, expected));
    }

    @Test
    public void test3(){
        var list1 = llh.generateListNode();
        var list2 = llh.generateListNode(0);
        var expected = new int [] {0};
        var response = solution.mergeTwoLists(list1, list2);
        var message = String.format("Expected %s, but got %s.", llh.stringifyArr(expected), llh.stringifyNode(response));
        Assert.assertTrue(llh.confirmListNode(response, expected));
    }
}
