class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == i){
                stack.pop();
                continue;
            }
            stack.push(i);
        }
        
        Iterator value = stack.iterator();
        String ans = "";

        while(value.hasNext()){
            ans += value.next();
        }

        return ans;
    }
}