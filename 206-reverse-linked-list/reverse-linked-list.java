/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //ListNode ans = null;
        // ListNode curr = head;
        
        // while(curr != null){
        //     ListNode nextNode = curr.next;
        //     curr.next = ans;
        //     ans = curr;
        //     curr = nextNode;
        // }
        // return ans;
        
        if(head == null)
            return null;
        return traverser(head)[0];
    }

    public ListNode[] traverser(ListNode curr){
        if(curr.next == null)
            return new ListNode[]{curr, curr};
        
        ListNode[] nextNode = traverser(curr.next);
        nextNode[1].next = curr;
        curr.next = null;
        return new ListNode[]{nextNode[0], curr};
    }
}