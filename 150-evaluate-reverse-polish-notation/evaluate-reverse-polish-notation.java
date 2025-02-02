class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();

        for(String i : tokens){
            if(i.equals("+")){
                stack.push(stack.pop() + stack.pop());
                continue;
            }
            
            if(i.equals("-")){
                int div = stack.pop();
                stack.push(stack.pop() - div);
                continue;
            }
            
            if(i.equals("*")){
                stack.push(stack.pop() * stack.pop());
                continue;
            }
            
            if(i.equals("/")){
                int div = stack.pop();
                stack.push(stack.pop() / div);
                continue;
            }

            stack.push(Integer.parseInt(i));
            // System.out.println(stack);
        }
        // System.out.println(stack);
        return stack.pop();
    }
}