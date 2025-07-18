class RecentCounter {
    Queue<Integer>pings;
    public RecentCounter() {
        pings = new LinkedList<>();
    }
    
    public int ping(int t) {
        pings.offer(t);

        while(!pings.isEmpty() && t - pings.peek() > 3000){
            pings.poll();
        }

        return pings.size();
    }
}