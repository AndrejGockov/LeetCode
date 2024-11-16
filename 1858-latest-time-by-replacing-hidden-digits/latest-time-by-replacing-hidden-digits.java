class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        char one = sb.charAt(1);
        if(time.toCharArray()[0] == '?'){
            if(one < '4' || time.toCharArray()[1] == '?')
                sb.setCharAt(0, '2');
            else
                sb.setCharAt(0, '1');
        }
        
        if(time.toCharArray()[1] == '?' && (time.toCharArray()[0] == '2' || time.toCharArray()[0] == '?')){
            sb.setCharAt(1, '3');
        }else if(time.toCharArray()[1] == '?' && time.toCharArray()[0] != '2'){
            sb.setCharAt(1, '9');
        }

        if(time.toCharArray()[3] == '?')
            sb.setCharAt(3, '5');
        
        if(time.toCharArray()[4] == '?')
            sb.setCharAt(4, '9');
        
        
        return sb.toString();
    }
}