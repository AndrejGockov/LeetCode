class Solution {
    public ListNode partition(ListNode head, int x) {
        List<Integer>lessThan = new ArrayList<>();
        List<Integer>greaterThan = new ArrayList<>();

        while(head != null){
            if(head.val < x){
                lessThan.add(head.val);
            }else{
                greaterThan.add(head.val);
            }
            head = head.next;
        }

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        for(int i : lessThan){
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }

        for(int i : greaterThan){
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }

        return ans.next;
    }
}