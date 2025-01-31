class Solution {
    public Stack<Integer>listToStack(ListNode list){
        Stack<Integer>stack = new Stack<>();
        while(list != null){
            stack.push(list.val);
            list = list.next;
        }
        return stack;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer>num1 = listToStack(l1);
        Stack<Integer>num2 = listToStack(l2);
        Stack<Integer>sum = new Stack<>();
        int carry = 0;
        System.out.println(num1);
        System.out.println(num2);

        while(!num1.isEmpty() && !num2.isEmpty()){
            int digit = num1.pop() + num2.pop() + carry;
            carry = 0;
            
            if(digit >= 10){
                sum.push(digit % 10);
                carry = digit / 10;
            }else{
                sum.push(digit);
            }
        }
        
        while(!num1.isEmpty()){
            int digit = num1.pop() + carry;
            carry = 0;
            
            if(digit >= 10){
                sum.push(digit % 10);
                carry = digit / 10;
                continue;
            }
            
            sum.push(digit);
        }

        while(!num2.isEmpty()){
            int digit = num2.pop() + carry;
            carry = 0;
            
            if(digit >= 10){
                sum.push(digit % 10);
                carry = digit / 10;
                continue;
            }
            
            sum.push(digit);
        }
        
        if(carry > 0)
            sum.push(carry);
        
        System.out.println(sum);
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        while(!sum.isEmpty()){
            dummy.next = new ListNode(sum.pop());
            dummy = dummy.next;
        }

        return ans.next;
    }
}