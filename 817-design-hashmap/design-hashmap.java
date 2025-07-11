class MyHashMap {
    ArrayList<Integer> keys;
    ArrayList<Integer> values;
    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int i = 0;
        for (Integer num : keys) {
            if(key == num){
                values.set(i, value);
                return;
            }
            i++;
        }
        
        keys.add(key);
        values.add(value);
    }
    
    public int get(int key) {
        int i = 0;
        for (Integer num : keys) {
            if(key == num)
                return values.get(i);
            i++;
        }
        return -1;
    }
    
    public void remove(int key) {
        int i = 0;
        for (Integer num : keys) {
            if(key == num){
                keys.remove(i);
                values.remove(i);
                return;
            }
            i++;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */