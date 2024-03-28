class Solution {
public:
    string defangIPaddr(string address) {
        string ans = "";
        for(int i = 0; i < address.size(); i++){
            ans+= address[i];
            if(address[i + 1] == '.')
                ans += "[";
            if(address[i] == '.')
                ans += "]";
        }

        return ans;
    }
};