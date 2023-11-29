package leetcode.add_two_numbers__LeetCode_2;

public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var l1I = new ListNodeIterator(l1);
        var l2I = new ListNodeIterator(l2);
        var head = new ListNode(-1);
        var curr = head;
        var remainder = 0;
        while(l1I.hasNext() || l2I.hasNext() || remainder > 0){
            var curVal = l1I.get() + l2I.get() + remainder;
            var toAdd = curVal % 10;
            remainder = curVal / 10;
            curr.next = new ListNode(toAdd);
            curr = curr.next;
        }
        return head.next;
    }
}


class ListNodeIterator{
    private ListNode node;
    public ListNodeIterator(ListNode node){
        this.node = node;
    }

    public boolean hasNext(){
        return node != null;
    }

    public int get(){
        if (node == null){
            return 0;
        }
        var val = node.val;
        node = node.next;
        return val;
    }
}