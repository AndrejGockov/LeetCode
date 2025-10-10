class Solution {
    public String convertToTitle(int columnNumber) {
        // If there's only one letter
        if(columnNumber <= 26){
            int baseASCII = 'A' - 1 + columnNumber;
            char letter = (char)baseASCII;
            return String.valueOf(letter);
        }

        StringBuilder ans = new StringBuilder();
        
        while(columnNumber > 0){
            columnNumber--;
            int baseASCII = (columnNumber % 26) + 'A';
            char letter = (char)baseASCII;
            columnNumber /= 26;
            
            ans.insert(0, String.valueOf(letter));
        }
        
        return ans.toString();
    }
}