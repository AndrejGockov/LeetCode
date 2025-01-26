class Solution {
    public String stackToString(Stack<Character>stack){
        Iterator value = stack.iterator();
        String res = "";

        while(value.hasNext()){
            res+=value.next();
        }

        return res;
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackOne = new Stack<>();
        Stack<Character> stackTwo = new Stack<>();

        for(char i : s.toCharArray()){
            if(i == '#' && !stackOne.isEmpty())
                stackOne.pop();
            
            if(i != '#')
                stackOne.push(i);
        }

        for(char i : t.toCharArray()){
            if(i == '#' && !stackTwo.isEmpty())
                stackTwo.pop();
            
            if(i != '#')
                stackTwo.push(i);
        }
        // System.out.println(stackToString(stackOne) + " " + stackToString(stackTwo));
        return stackToString(stackOne).equals(stackToString(stackTwo));
    }
}