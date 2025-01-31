class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer>stack = new Stack<>();

        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        
        Stack<Integer>remainingNums = new Stack<>();
        int highestNum = 0;
        
        while(!stack.isEmpty()){
            if(stack.peek() > highestNum){
                highestNum = stack.peek();
            }
            
            if(stack.peek() < highestNum){
                stack.pop();
                continue;
            }

            System.out.println(stack.peek());
            remainingNums.push(stack.pop());
        }
        
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        while(!remainingNums.isEmpty()){
            dummy.next = new ListNode(remainingNums.pop()); 
            dummy = dummy.next;
        }

        return ans.next;
    }
}