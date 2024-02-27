class Solution {
public:
    string categorizeBox(int length, int width, int height, int mass) {
        if(mass >= 100 && (((long long)length * width * height) >= 1e9 
        ||(length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000)))
            return "Both";
        
        if(((long long)length * width * height) >= 1e9 ||
        (length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000))
            return "Bulky";
        
        if(mass >= 100)
            return "Heavy";
        return "Neither";
    }
};