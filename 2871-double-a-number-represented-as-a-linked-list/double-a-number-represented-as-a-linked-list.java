class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer>digits = new Stack<>();

        while(head != null){
            digits.push(head.val);
            head = head.next;
        }
        
        System.out.println(digits);
        Stack<Integer>multipliedDigits = new Stack<>();
        int carry = 0;
        while(!digits.isEmpty()){
            int number = digits.pop() * 2 + carry;
            carry = 0;

            if(number >= 10){
                multipliedDigits.push(number % 10);
                carry = number / 10;
                continue;
            }
            multipliedDigits.push(number);
        }
        
        if(carry > 0)
            multipliedDigits.push(carry);

        System.out.println(multipliedDigits);
        
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        while(!multipliedDigits.isEmpty()){
            dummy.next = new ListNode(multipliedDigits.pop()); 
            dummy = dummy.next;
        }

        return ans.next;
    }
}