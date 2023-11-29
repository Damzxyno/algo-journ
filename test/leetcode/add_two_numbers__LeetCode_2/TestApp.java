package leetcode.add_two_numbers__LeetCode_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    private final AddTwoNumbersSolution solution = new AddTwoNumbersSolution();

    @Test
    public void test1(){
        var req1 = generateListNode(2, 4, 3);
        var req2 = generateListNode(5, 6, 4);
        var expected = new int []{7, 0, 8};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", stringifyArr(expected), stringifyNode(result));
        Assert.assertTrue(message, confirmListNode(result, expected));
    }

    @Test
    public void test2(){
        var req1 = generateListNode(0);
        var req2 = generateListNode(0);
        var expected = new int []{0};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", stringifyArr(expected), stringifyNode(result));
        Assert.assertTrue(message, confirmListNode(result, expected));
    }

    @Test
    public void test3(){
        var req1 = generateListNode(9,9,9,9,9,9,9);
        var req2 = generateListNode(9,9,9,9);
        var expected = new int []{8,9,9,9,0,0,0,1};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", stringifyArr(expected), stringifyNode(result));
        Assert.assertTrue(message, confirmListNode(result, expected));
    }

    @Test
    public void test4(){
        var req1 = generateListNode(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1);
        var req2 = generateListNode(5,6,4);
        var expected = new int []{6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        var result = solution.addTwoNumbers(req1, req2);
        var message = String.format("Expected %s, got %s", stringifyArr(expected), stringifyNode(result));
        Assert.assertTrue(message, confirmListNode(result, expected));
    }



    private List<Integer> stringifyNode(ListNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
    private String stringifyArr(int [] a){
        var sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++){
            sb.append(a[i]);
            if (i < a.length - 1){
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private boolean confirmListNode(ListNode node, int [] a){
        for (var item : a){
            if (node == null){
                return false;
            }
            if (node.val != item){
                return false;
            }
            node = node.next;
        }
        return true;
    }

    private ListNode generateListNode(int ...a){
        ListNode head = new ListNode(-1);
        var curr = head;
        for (var item : a){
            curr.next = new ListNode(item);
            curr = curr.next;
        }
        return head.next;
    }
}
