class NumberContainers {
    Map<Integer, Integer>indxToNumber;
    Map<Integer, PriorityQueue<Integer>>numberToIndx;
    
    public NumberContainers() {
        indxToNumber = new HashMap<>();
        numberToIndx = new HashMap<>();
    }
    
    public void change(int index, int number) {
        indxToNumber.put(index, number);
        if(!numberToIndx.containsKey(number))
            numberToIndx.put(number, new PriorityQueue<>());
        numberToIndx.get(number).offer(index);
    }
    
    public int find(int number) {
        if(!numberToIndx.containsKey(number))
            return -1;
        
        PriorityQueue<Integer>queue = numberToIndx.get(number);

        while(!queue.isEmpty()){
            int indx =  queue.peek();

            if(indxToNumber.get(indx) == number)
                break;
            else
                queue.poll();
        }

        if(queue.isEmpty()){
            numberToIndx.remove(number);
            return -1;
        }

        return numberToIndx.get(number).peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */