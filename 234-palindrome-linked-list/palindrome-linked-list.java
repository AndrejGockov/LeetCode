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
    public boolean isPalindrome(ListNode head) {
        int n = 0;
        int[] arr = new int[countList(head)];
        while(head != null){
            arr[n] = head.val;
            head = head.next;
            n++;
        }

        for(int i = 0; i <= n / 2; i++)
            if(arr[i] != arr[n - i - 1])
                return false;

        return true;
    }

    public int countList(ListNode head){
        int n = 0;
        while(head != null){
            head = head.next;
            n++;
        }
        return n;
    }
}