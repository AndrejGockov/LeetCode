class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer>sTable = new HashMap<>();

        for(char i : s.toCharArray()){
            sTable.put(i, sTable.getOrDefault(i, 0) + 1);
        }

        for(char i : t.toCharArray()){
            if(sTable.get(i) == null || sTable.get(i) == 0)
                return false;
            
            sTable.put(i, sTable.get(i) - 1);
        }

        return true;
    }
}