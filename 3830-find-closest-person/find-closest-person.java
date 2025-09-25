class Solution {
    public int findClosest(int x, int y, int z) {
        int personA = Math.abs(z - x);
        int personB = Math.abs(z - y);

        if(personA < personB)
            return 1;
        if(personA > personB)
            return 2;
        
        return 0;
    }
}