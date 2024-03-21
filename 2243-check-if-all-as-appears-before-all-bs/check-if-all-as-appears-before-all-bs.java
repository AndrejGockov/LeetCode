class Solution {
    public boolean checkString(String s) {
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == 'b'){
                while(i < s.length()){
                    if(s.charAt(i++) == 'a'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}