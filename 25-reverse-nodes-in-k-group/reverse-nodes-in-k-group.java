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
    public ListNode reverseKGroup(ListNode head, int k) {
        int indx = 0;
        List<Integer>tmp = new ArrayList<>();
        List<List<Integer>>list = new ArrayList<>();

        while(head != null){
            if(indx == k){
                indx = 0;
                list.add(tmp);
                tmp = new ArrayList<>();
            }
            
            tmp.add(head.val);
            head = head.next;
            indx++;
        }

        if(tmp.size() == k){
            list.add(tmp);
            tmp = new ArrayList<>();
        }
        
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        System.out.println(list);

        for(List<Integer>group : list){
            int n = group.size() - 1;
            for(int i = n; i >= 0; i--){
                System.out.println(group.get(i));
                dummy.next = new ListNode(group.get(i));
                dummy = dummy.next;
            }
        }

        for(int remaining : tmp){
            dummy.next = new ListNode(remaining);
            dummy = dummy.next;
        }

        return ans.next;
    }
}