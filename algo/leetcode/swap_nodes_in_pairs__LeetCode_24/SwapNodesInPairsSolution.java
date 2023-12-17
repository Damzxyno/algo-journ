package leetcode.swap_nodes_in_pairs__LeetCode_24;

import leetcode.add_two_numbers__LeetCode_2.ListNode;

public class SwapNodesInPairsSolution {
    public ListNode swapPairs(ListNode head) {
        var currSwap = head;


        if (currSwap != null && currSwap.next != null){
            var swap1 = currSwap;
            var swap2 = currSwap.next;
            var swap3 = swap2.next;
            head = swap2;
            swap2.next = swap1;
            swap1.next = swap3;
            currSwap = swap1;
        }
        if (currSwap == null) {
            return head;
        }
        while (currSwap.next != null && currSwap.next.next != null){
            var swap1 = currSwap.next;
            var swap2 = currSwap.next.next;
            var swap3 = swap2.next;
            swap2.next = swap1;
            swap1.next = swap3;
            currSwap.next = swap2;
            currSwap = swap1;
        }

        return head;
    }
}
