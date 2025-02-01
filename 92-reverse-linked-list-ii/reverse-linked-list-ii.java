class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        ListNode postRev = new ListNode(0);
        ListNode postRevDummy = postRev;
        Stack<Integer>reverse = new Stack<>();
        int i = 1;
        
        while(head != null){
            if(i < left){
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            }

            if(i >= left && i <= right){
                reverse.push(head.val);
            }

            if(i > right){
                postRevDummy.next = new ListNode(head.val);
                postRevDummy = postRevDummy.next;
            }

            head = head.next;
            i++;
        }

        while(!reverse.isEmpty()){
            dummy.next = new ListNode(reverse.pop());
            dummy = dummy.next;
        }

        postRev = postRev.next;

        while(postRev != null){
            dummy.next = new ListNode(postRev.val);
            dummy = dummy.next;
            postRev = postRev.next;
        }

        return ans.next;
    }
}