package leetcode.merge_two_lists__LeetCode_21;

import leetcode.add_two_numbers__LeetCode_2.ListNode;

public class MergeTwoListSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var head = new ListNode(-1);
        var curr = head;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
            curr.next = null;
        }
        if (list1 != null){
            curr.next = list1;
        }
        if (list2 != null){
            curr.next = list2;
        }
        return head.next;
    }
}
