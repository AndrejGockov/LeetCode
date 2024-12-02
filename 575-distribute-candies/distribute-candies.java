class Solution {
    public int distributeCandies(int[] candyType) {
        int candiesEaten = 0;
        int n = candyType.length;

        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < n; i++){
            int currentCandy = candyType[i];
            
            // If she hasnt eaten this candy type before, add it to the hash map and increase candiesEaten
            if(!hash.contains(currentCandy)){
                candiesEaten++;
                hash.add(currentCandy);
            }

            // If shes eaten her max amount of candies, then stop
            if(candiesEaten == n / 2)
                break;
        }

        return candiesEaten;
    }
}