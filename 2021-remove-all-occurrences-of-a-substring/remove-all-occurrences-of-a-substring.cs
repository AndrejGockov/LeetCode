public class Solution {
    public string RemoveOccurrences(string s, string part) {
        StringBuilder stack = new StringBuilder();
        int m = part.Length;

        foreach(char i in s){
            stack.Append(i);
            
            if(stack.Length >= m){
                String subStr = stack.ToString(stack.Length - m, m);

                if(subStr == part){
                    stack.Length -= m;
                }
            }
        }

        return stack.ToString();
    }
}