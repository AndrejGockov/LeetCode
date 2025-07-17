class FrequencyTracker {
    int[] numbers;
    int[] freq;
    
    public FrequencyTracker() {
        numbers = new int[100001];
        freq = new int[100001];
    }
    
    public void add(int number) {
        freq[numbers[number]++]--;
        freq[numbers[number]]++;
    }
    
    public void deleteOne(int number) {
        if(numbers[number] > 0){
            freq[numbers[number]--]--;
            freq[numbers[number]]++;
        }
    }
    
    public boolean hasFrequency(int frequency) {
        return freq[frequency] > 0;
    }
}