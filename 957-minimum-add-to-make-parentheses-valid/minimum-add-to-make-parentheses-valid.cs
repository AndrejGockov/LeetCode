public class Solution {
    public int MinAddToMakeValid(string s) {
        Stack<Char>stack = new Stack<Char>();
        
        foreach(char i in s){
            if(stack.Count == 0){
                stack.Push(i);
                continue;
            }

            if(i == ')'){
                if(stack.Peek() == '('){
                    stack.Pop();
                }else{
                    stack.Push(i);
                }
            }else{
                stack.Push(i);
            }

            Console.WriteLine(stack.Count);
        }

        return stack.Count;
    }
}