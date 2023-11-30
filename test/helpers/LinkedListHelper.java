package helpers;
import leetcode.add_two_numbers__LeetCode_2.ListNode;
import java.util.ArrayList;
import java.util.List;

public class LinkedListHelper {
    public List<Integer> stringifyNode(ListNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
    public String stringifyArr(int [] a){
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

    public boolean confirmListNode(ListNode node, int [] a){
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

    public ListNode generateListNode(int ...a){
        ListNode head = new ListNode(-1);
        var curr = head;
        for (var item : a){
            curr.next = new ListNode(item);
            curr = curr.next;
        }
        return head.next;
    }
}
