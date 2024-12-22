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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>elements = new ArrayList<Integer>();

        for(ListNode node : lists){
            while(node != null){
                elements.add(node.val);
                System.out.println(node.val);
                node = node.next;
            }
        }

        Collections.sort(elements);
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        for(int i : elements){
            dummy.next = new ListNode(i); 
            dummy = dummy.next;
        }

        return ans.next;
    }
}