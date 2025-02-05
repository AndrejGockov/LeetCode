class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;

        int n = s1.length();
        ArrayList<Character>hash1 = new ArrayList<>();
        ArrayList<Character>hash2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                hash1.add(s1.charAt(i));
                hash2.add(s2.charAt(i));
            }
        }

        for(Character i : hash1)
            if(!hash2.contains(i))
                return false;

        return hash1.size() == 2 && hash2.size() == 2;
    }
}