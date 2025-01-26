class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(!stack.isEmpty() 
            && (Character.isUpperCase(stack.peek()) || Character.isUpperCase(i))
            && (Character.isLowerCase(stack.peek()) || Character.isLowerCase(i))
            && Character.toLowerCase(stack.peek()) == Character.toLowerCase(i)){
                stack.pop();
                continue;
            }

            stack.push(i);
        }
        
        String ans = "";
        Iterator value = stack.iterator();
        
        while(value.hasNext()){
            ans += value.next();
        }

        return ans;
    }
}