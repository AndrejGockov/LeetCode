public class Solution {
    public string ValidIPAddress(string queryIP) {
        if(queryIP.Contains('.')){
            string[] args = queryIP.Split('.');

            if(args.Length != 4)
                return "Neither";

            foreach(string i in args){
                string mask = "";
                foreach(char j in i){
                    if(!char.IsDigit(j))
                        return "Neither";
                    
                    mask += j;
                }

                if(mask.Length == 0 
                    || (mask.Length > 1 && mask[0] == '0')
                    || mask.Length > 3
                    || int.Parse(mask) > 255)
                    return "Neither";
            }

            return "IPv4";
        }else if(queryIP.Contains(':')){
            string[] args = queryIP.Split(':');

            if(args.Length != 8)
                return "Neither";

            foreach(string i in args){
                if(i.Length < 1 
                    || i.Length > 4)
                    return "Neither";
                
                string mask = "";
                
                foreach(char j in i){
                    if(char.IsLetter(j)){
                        int ascii = (int)char.ToLower(j);

                        if(ascii < (int)'a'
                            || ascii > (int)'f')
                            return "Neither";
                        
                    }else if(!char.IsDigit(j)){
                        return "Neither";
                    }
                }
            }
            
            return "IPv6";
        }

        return "Neither";
    }
}