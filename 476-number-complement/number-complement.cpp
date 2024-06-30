class Solution {
public:
    int findComplement(int num) {
        long long ans = 0;
        int binary[64];
        int i = 0;
        while(num > 0){
            binary[i] = num % 2;
            if(binary[i] == 1)
                binary[i] = 0;
            else
                binary[i] = 1;
            cout<<binary[i];
            num /= 2;
            i++;
        }
        int j = 0;
        long long factor = 1;
        while(j < i){
            if(binary[j] == 1)
                ans+= factor;
            factor *= 2;
            j++;
        }
        return ans;
    }
};