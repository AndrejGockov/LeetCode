class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer>temps = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!temps.isEmpty() && temperatures[temps.peek()] < temperatures[i]){
                ans[temps.peek()] = i - temps.peek();
                temps.pop();
            }
            temps.add(i);
        }

        return ans;
    }
}