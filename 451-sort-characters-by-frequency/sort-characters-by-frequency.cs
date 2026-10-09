public class Solution {
    public string FrequencySort(string s) {
        string ans = "";
        Dictionary<char, int>map = new Dictionary<char, int>();

        foreach(char i in s){
            if(map.ContainsKey(i)){
                map[i] = map[i] + 1;
            }else{
                map.Add(i, 1);
            }
        }

        PriorityQueue<char, int> priorityQueue = new PriorityQueue<char, int>();
        
        foreach(var kvp in map){
            priorityQueue.Enqueue(kvp.Key, kvp.Value);
        }

        while(priorityQueue.TryDequeue(out char key, out int val)){
            Console.WriteLine(key + " " + val);
            ans = new string(key, val) + ans;
        }

        return ans;
    }
}