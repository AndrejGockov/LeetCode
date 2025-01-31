class Solution {
    public static int listLength(ListNode head){
        int i = 0;
        while(head != null){
            i++;
            head = head.next;
        }
        return i;
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        int[] arr = new int[listLength(head)];
        int i = 0;
        
        while(head != null){
            arr[i] = head.val;
            i++;
            head = head.next;
        }
        
        HashSet<Integer>bannedNumbers = new HashSet<>();
        for(int num : nums){
            bannedNumbers.add(num);
        }
        
        for(i = 0; i < arr.length; i++)
            if(bannedNumbers.contains(arr[i]))
                arr[i] = -1;
        
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        for(i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                dummy.next = new ListNode(arr[i]);
                dummy = dummy.next;
            }
        }

        return ans.next;
    }
}