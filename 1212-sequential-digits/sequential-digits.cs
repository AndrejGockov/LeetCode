public class Solution {
    public IList<int> SequentialDigits(int low, int high) {
        List<int>nums = new List<int>();
        String ascendingNumbers = "123456789";
        int i = 0;
        int n = ascendingNumbers.Length;

        while(i < n){
            int j = i + 1;
            int number = 0;
            
            while(j <= n){
                number = int.Parse(ascendingNumbers[i..j]);
                Console.WriteLine(number);

                if(number >= low && number <= high){
                    nums.Add(number);
                } else if(number >= high){
                    Console.WriteLine("---BREAK---");
                    break;
                }
                j++;
            }
            i++;
        }
        
        nums.Sort();
        IList<int>ans = nums;

        return ans;
    }
}