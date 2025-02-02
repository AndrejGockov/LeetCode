class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        HashSet<String>repeat = new HashSet<>();
        HashSet<String>seen = new HashSet<>();

        for(int i = 0; i <= n - 10; i++){
            String dna = s.substring(i, i + 10);
            if(!seen.add(dna))
                repeat.add(dna);
        }

        List<String>ans = new ArrayList<>();
        ans.addAll(repeat);
        
        return ans;
    }
}