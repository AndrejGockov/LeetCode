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
    public int getLength(ListNode list) {
        int length = 0;
        while(list != null){
            length++;
            list = list.next;
        }
        return length;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = null;
        ListNode dummy = head;
        
        int length = getLength(head);
        int i = 0;
        
        while(i < length - n){
            i++;
            ans = dummy;
            dummy = dummy.next;
        }
        if(ans != null)
            ans.next = dummy.next;
        else
            head = head.next;
        return head;
    }
}