class TopVotedCandidate {
    TreeMap<Integer, Integer>hash = new TreeMap<>();
    
    public TopVotedCandidate(int[] persons, int[] times) {
        int[] cnt = new int[persons.length];
        int maxCnt = 0;
        
        for (int i = 0; i < persons.length; i++){
            int p = persons[i], t = times[i];
            if (++cnt[p] >= maxCnt){
                maxCnt = cnt[p];
                hash.put(t, p);
            }
        }
    }
    
    public int q(int t) {
        int k = hash.floorKey(t);
        return hash.get(k);
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */